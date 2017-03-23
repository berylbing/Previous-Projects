package org.algorithm.dataPretreatment.segmentation_weibo;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;

import org.entity.bean.Postswords_seg;
import org.entity.bean.Weiboswords_seg;
import org.util.Configer;

import ICTCLAS.I3S.AC.ICTCLAS50;




public class TestMain
{   

	public static String testICTCLAS_ParagraphProcess(String sInput)
	{
		String nativeStr1 = null;
		try
		{
			ICTCLAS50 testICTCLAS50 = new ICTCLAS50();
			String argu = ".\\api";
			//初始化
			System.out.println(argu.getBytes("GB2312"));
			if (testICTCLAS50.ICTCLAS_Init(argu.getBytes("GB2312")) == false)
			{
				System.out.println("Init Fail!");
				return null;
			}


			//设置词性标注集(0 计算所二级标注集，1 计算所一级标注集，2 北大二级标注集，3 北大一级标注集)
			testICTCLAS50.ICTCLAS_SetPOSmap(2);


			//导入用户词典前分词
			byte nativeBytes[] = testICTCLAS50.ICTCLAS_ParagraphProcess(sInput.getBytes("GB2312"), 0, 1);//分词处理
			System.out.println(nativeBytes.length);
			String nativeStr = new String(nativeBytes, 0, nativeBytes.length, "GB2312");
			System.out.println("未导入用户词典的分词结果： " + nativeStr);//打印结果


			//导入用户字典
			int nCount = 0;
			String usrdir = "userdict.txt"; //用户字典路径
			byte[] usrdirb = usrdir.getBytes();//将string转化为byte类型
			//导入用户字典,返回导入用户词语个数第一个参数为用户字典路径，第二个参数为用户字典的编码类型
			nCount = testICTCLAS50.ICTCLAS_ImportUserDictFile(usrdirb, 0);
			System.out.println("导入用户词个数" + nCount);
			nCount = 0;


			//导入用户字典后再分词
			byte nativeBytes1[] = testICTCLAS50.ICTCLAS_ParagraphProcess(sInput.getBytes("GB2312"), 0, 1);
			System.out.println(nativeBytes1.length);
			nativeStr1 = new String(nativeBytes1, 0, nativeBytes1.length, "GB2312");
			System.out.println("导入用户词典后的分词结果： " + nativeStr1);
			//保存用户字典
			testICTCLAS50.ICTCLAS_SaveTheUsrDic();
			//释放分词组件资源
			testICTCLAS50.ICTCLAS_Exit();
		}
		catch (Exception ex)
		{
		}
		return nativeStr1;

	}



	public static void testICTCLAS_FileProcess()
	{
		try
		{
			ICTCLAS50 testICTCLAS50 = new ICTCLAS50();
			//分词所需库的路径
			String argu = ".\\api";
			//初始化
			if (testICTCLAS50.ICTCLAS_Init(argu.getBytes("GB2312")) == false)
			{
				System.out.println("Init Fail!");
				return;
			}

			//输入文件名
			String Inputfilename = "test.txt";
			byte[] Inputfilenameb = Inputfilename.getBytes();//将文件名string类型转为byte类型

			//分词处理后输出文件名
			String Outputfilename = "test_result.txt";
			byte[] Outputfilenameb = Outputfilename.getBytes();//将文件名string类型转为byte类型

			//文件分词(第一个参数为输入文件的名,第二个参数为文件编码类型,第三个参数为是否标记词性集1 yes,0 no,第四个参数为输出文件名)
			testICTCLAS50.ICTCLAS_FileProcess(Inputfilenameb, 0, 1, Outputfilenameb);

			int nCount = 0;
			String usrdir = "userdict.txt"; //用户字典路径
			byte[] usrdirb = usrdir.getBytes();//将string转化为byte类型
			//第一个参数为用户字典路径，第二个参数为用户字典的编码类型(0:type unknown;1:ASCII码;2:GB2312,GBK,GB10380;3:UTF-8;4:BIG5)
			nCount = testICTCLAS50.ICTCLAS_ImportUserDictFile(usrdirb, 0);//导入用户字典,返回导入用户词语个数
			System.out.println("导入用户词个数" + nCount);
			nCount = 0;

			String Outputfilename1 = "testing_result.txt";
			byte[] Outputfilenameb1 = Outputfilename1.getBytes();//将文件名string类型转为byte类型

			//文件分词(第一个参数为输入文件的名,第二个参数为文件编码类型,第三个参数为是否标记词性集1 yes,0 no,第四个参数为输出文件名)
			testICTCLAS50.ICTCLAS_FileProcess(Inputfilenameb, 0, 0, Outputfilenameb1);

		}
		catch (Exception ex)
		{
		}
		
	}
	
	private static int byteToInt2(byte[]b)
	{
		int temp=0;  
        for(int i=0;i<3;i++){  
            if(b[i]<0){  
                temp+=(b[i]+256);  
            }else{  
                temp+=b[i];  
            }  
            temp*=256;  
        }  
        temp+=b[3];  
        if(b[3]<0){  
            temp+=256;  
        }  
        return temp;  
	}
	
	

	//对分词结果过滤 return 0:删除；return 1:保留
	public int testICTCLAS_ParagraphFilt(String word, String sPOS)
	{
		String delsPOS[] = "vshi,vyou,r,m,q,p,c,w,o,y,e,uzhe,ule,uguo,ude1,ude2,ude3,usuo,udeng,uyy,udh,uls,uzhi,ulian,x".split(",");
		try{
			if(sPOS.equals("")) return 0;
			//从词性判断删除
			for(String ee : delsPOS){
				if(sPOS.startsWith(ee)){
					return 0;
				}
			}
			//删除长度为1的词
			if(word.length()==1) return 0;
			
			//从停用词表判断删除
			FileInputStream fis1 = new FileInputStream(Configer.work_dir+"keyword.txt");
			DataInputStream in1 = new DataInputStream(fis1);
			BufferedReader br1 = new BufferedReader(new InputStreamReader(in1, "GBK"));// , "UTF-8"  
			String keyword = null;
			while((keyword = br1.readLine()) != null)
			{
				if(word.equals(keyword)) {
					return 0;
				}
			}
			br1.close();
			in1.close();
			fis1.close();
			return 1;
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		return 1;
	}
	
	
	//文件结果分词过滤 输入文件时文件分词后产生的GBK格式文件，输出文件是GBK格式
	//如果要可以读入或输出任意格式文件，首先应该获取读入文件本身的编码格式
	public static void testICTCLAS_FileFilt()
	{
		try
		{
//			String line_separator = System.getProperty("line.separator"); 
			  FileInputStream fis = new FileInputStream("test_result.txt");
			  StringBuffer sb = new StringBuffer();
			  DataInputStream in = new DataInputStream(fis);
			  BufferedReader br = new BufferedReader(new InputStreamReader(in, "GBK"));// , "UTF-8"  
			  String lineContent = null;
			  
			  while( (lineContent = br.readLine()) != null){
//				System.out.println(lineContent);
				String str[] = lineContent.split(" ");
				for(int i=0; i<str.length; i++){
					FileInputStream fis1 = new FileInputStream("keyword.txt");
					DataInputStream in1 = new DataInputStream(fis1);
					BufferedReader br1 = new BufferedReader(new InputStreamReader(in1, "GBK"));// , "UTF-8"  
					String keyword = null;
					String str2[] = str[i].split("/");
					int flag = 0;//判断是否删除的标志，0：不删除；1：删除；
					if(str2.length>1){
						//从词性判断删除
						if(str2[1].startsWith("w")){
						 flag = 1;	
						}
						//从停用词表判断删除
						while((keyword = br1.readLine()) != null)
						{
							if(str2[0].equals(keyword)) {
								flag = 1;
								break;
							}
						}
						if(flag==0){
							sb.append(str[i]);
							sb.append(" ");
						}
						br1.close();
						in1.close();
						fis1.close();
					}
				}
//				sb.append(line_separator);
			}
			 
			  br.close();
			  in.close();
			  fis.close();
			      
			  Writer ow = new OutputStreamWriter(new FileOutputStream("test_result1.txt"), "GBK");
			  ow.write(sb.toString());
			  ow.close();
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}


	}



	public ArrayList<Weiboswords_seg> segmentationTitle(String title,
			ICTCLAS50 testICTCLAS50) {
		// // TODO Auto-generated method stub
		ArrayList<Weiboswords_seg> al = new ArrayList<Weiboswords_seg>();
		try {
			String argu = Configer.work_dir + "api";
			// 初始化
//			System.out.println(argu.getBytes("GB2312"));
			if (testICTCLAS50.ICTCLAS_Init(argu.getBytes("GB2312")) == false) {
				System.out.println("Init Fail!");
				return null;
			}

			// 导入用户字典后再分词
			byte nativeBytes1[] = testICTCLAS50.ICTCLAS_ParagraphProcess(title
					.getBytes("GB2312"), 0, 1);
			System.out.println(nativeBytes1.length);
			String nativeStr1 = new String(nativeBytes1, 0,
					nativeBytes1.length, "GB2312");
			System.out.println("导入用户词典后的分词结果： " + nativeStr1);

			String temp[] = nativeStr1.split(" ");
			// 将处理结果赋值给结构体
			for (String str : temp) {
				int guolv = 0;
				Weiboswords_seg stR = new Weiboswords_seg();
				if (str.split("/").length > 1) {
					stR.setWords(str.split("/")[0]);
					stR.setSPos(str.split("/")[1]);
					guolv = this.testICTCLAS_ParagraphFilt(stR.getWords(), stR.getSPos());
				}
				if (guolv == 1)
					al.add(stR);
				else
					continue;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		//
		return al;
	}

	public ArrayList<Weiboswords_seg> segmentationContent(String content,
			ICTCLAS50 testICTCLAS50) {
		// TODO Auto-generated method stub
		ArrayList<Weiboswords_seg> al = new ArrayList<Weiboswords_seg>();
		try {
			String argu = Configer.work_dir + "api";
			// 初始化
//			System.out.println(argu.getBytes("GB2312"));
			if (testICTCLAS50.ICTCLAS_Init(argu.getBytes("GB2312")) == false) {
				System.out.println("Init Fail!");
				return null;
			}
			// 导入用户字典后再分词
			byte nativeBytes1[] = testICTCLAS50.ICTCLAS_ParagraphProcess(
					content.getBytes("GB2312"), 0, 1);
			System.out.println(nativeBytes1.length);
			String nativeStr1 = new String(nativeBytes1, 0,
					nativeBytes1.length, "GB2312");
			System.out.println("导入用户词典后的分词结果： " + nativeStr1);

			String temp[] = nativeStr1.split(" ");
			// 将处理结果赋值给结构体
			for (String str : temp) {
				int guolv = 0;
				Weiboswords_seg stR = new Weiboswords_seg();
				if (str.split("/").length > 1) {
					stR.setWords(str.split("/")[0]);
					stR.setSPos(str.split("/")[1]);
					guolv = this.testICTCLAS_ParagraphFilt(stR.getWords(), stR.getSPos());
				}
				if (guolv == 1)
					al.add(stR);
				else
					continue;
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return al;
	}

}



	
	

	