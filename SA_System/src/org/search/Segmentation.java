package org.search;

import java.util.ArrayList;

import org.util.Config;

import ICTCLAS.I3S.AC.ICTCLAS50;

public class Segmentation {

	/**
	 * @author bing
	 * @param args
	 * @Time 2012-2-24
	 */
	public static ArrayList<String> testICTCLAS_ParagraphProcess(String sInput)
	{
		ArrayList<String> questionlist = new ArrayList<String>();
		try
		{
			ICTCLAS50 testICTCLAS50 = new ICTCLAS50();
			String argu = Config.work_dir + "api";
			//初始化
			//System.out.println(argu.getBytes("GB2312"));
			if (testICTCLAS50.ICTCLAS_Init(argu.getBytes("GB2312")) == false)
			{
				System.out.println("Init Fail!");
				return null;
			}
			//设置词性标注集(0 计算所二级标注集，1 计算所一级标注集，2 北大二级标注集，3 北大一级标注集)
			testICTCLAS50.ICTCLAS_SetPOSmap(0);

			//导入用户字典
			int nCount = 0;
			String usrdir = Config.work_dir+"userdict.txt"; //用户字典路径
			byte[] usrdirb = usrdir.getBytes();//将string转化为byte类型
			//导入用户字典,返回导入用户词语个数第一个参数为用户字典路径，第二个参数为用户字典的编码类型
			nCount = testICTCLAS50.ICTCLAS_ImportUserDictFile(usrdirb, 0);
			//System.out.println("导入用户词个数" + nCount);
			nCount = 0;

			//导入用户字典后再分词
			byte nativeBytes1[] = testICTCLAS50.ICTCLAS_ParagraphProcess(sInput.getBytes("GB2312"), 2, 1);
			//System.out.println(nativeBytes1.length);
			String nativeStr1 = new String(nativeBytes1, 0, nativeBytes1.length, "GB2312");
			
			for(String str : nativeStr1.split(" ")){
				questionlist.add(str);
			}
			
			//保存用户字典
			testICTCLAS50.ICTCLAS_SaveTheUsrDic();
			//释放分词组件资源
			testICTCLAS50.ICTCLAS_Exit();
		}
		catch (Exception ex)
		{
		}
		return questionlist;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sInput = "跑得快的动物有哪些？";
		testICTCLAS_ParagraphProcess(sInput);
	}

}
