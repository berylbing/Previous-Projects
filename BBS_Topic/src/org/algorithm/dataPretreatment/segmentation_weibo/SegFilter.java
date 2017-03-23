package org.algorithm.dataPretreatment.segmentation_weibo;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

import org.entity.bean.Weibos;
import org.entity.bean.Weiboswords_seg;
import org.util.Configer;
import org.util.MysqlConn;

import ICTCLAS.I3S.AC.ICTCLAS50;

public class SegFilter {

//	weibosDAO weibodao = new weibosDAO();
	/**
	 * @param args
	 * 1.把数据取出啦
	 * 2.分词
	 * 3.过滤
	 * @throws Exception 
	 */
	public String seg_Filter() throws Exception {
		// String path = "D:\\Workspaces\\myeclipes 8.5\\BBS_Topic0421\\";
		ICTCLAS50 testICTCLAS50 = new ICTCLAS50();
		// 设置词性标注集(0 计算所二级标注集，1 计算所一级标注集，2 北大二级标注集，3 北大一级标注集)
		testICTCLAS50.ICTCLAS_SetPOSmap(0);

		// 导入用户词典前分词
		TestMain tmm = new TestMain();
		String str = "导入用户词典前分词";
		tmm.segmentationTitle(str, testICTCLAS50);

		// 导入用户字典
		int nCount = 0;
		String usrdir = Configer.work_dir + "userdict.txt"; // 用户字典路径
//		File file = new File(usrdir);
//		System.out.println(file.getAbsolutePath());

		byte[] usrdirb = usrdir.getBytes();// 将string转化为byte类型
		// 导入用户字典,返回导入用户词语个数第一个参数为用户字典路径，第二个参数为用户字典的编码类型
		nCount = testICTCLAS50.ICTCLAS_ImportUserDictFile(usrdirb, 0);
		System.out.println("导入用户词个数" + nCount);
		nCount = 0;

		// ArrayList<weibos> p_abq = (ArrayList<weibos>)
		// weibodao.findByFlag(0);//.subList(0, 10000);
		ArrayList<Weibos> p_abq = new ArrayList<Weibos>();
		ArrayBlockingQueue<Weibos> weibos = new ArrayBlockingQueue<Weibos>(1000);
		ArrayBlockingQueue<Weiboswords_seg> pw_in = new ArrayBlockingQueue<Weiboswords_seg>(1000);
		for (int i = 0; i < 1; i++) {
			Segmentation consumer = new Segmentation(weibos, pw_in,testICTCLAS50);
			consumer.start();
		}

		for (int i = 0; i < 1; i++) {
			InDBs consumer = new InDBs(pw_in);
			consumer.start();
		}
		MysqlConn mconn = new MysqlConn();
		int start = mconn.find_weibos_start();
		System.out.println("start="+start);
		int last = mconn.find_weibos_last();
//		System.out.println("weibocount:"+weibocount);
//		mconn.close();
		int ii = start;
//		int starts = 0;
		while(true) {
//			System.out.println("ii="+ii+"...last="+last);
			if (ii <= last) {
				if (!p_abq.isEmpty() || !pw_in.isEmpty())
					Thread.sleep(10000);
				System.out.println("**********************************************ii="	+ ii);
//				p_abq.clear();
				p_abq = mconn.select_weibosbyID(ii, ii + 10000);
				System.out.println("p_abq.size():" + p_abq.size());
				for (int pp = 0; pp < p_abq.size(); pp++) {
					Weibos weibo = p_abq.get(pp);
					weibos.put(weibo);
				}
				ii = ii + 10000;
			}
//			if(ii>last) break;
			if(weibos.isEmpty() && pw_in.isEmpty()) break;
			System.out.println("p_abq.size()"+p_abq.size()+"...weibos"+weibos.size()+"...pw_in"+pw_in.size()+"ii="+ii+"...last="+last);
		}
		System.out.println("quit");
		// 保存用户字典
		testICTCLAS50.ICTCLAS_SaveTheUsrDic();
		// 释放分词组件资源
		testICTCLAS50.ICTCLAS_Exit();
		return "success";

	}

	 public static void main(String[] args) throws Exception {
	 // TODO Auto-generated method stub
	 SegFilter sf = new SegFilter();
	 sf.seg_Filter();
	
	 }

}
