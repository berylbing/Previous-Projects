package org.algorithm.dataPretreatment.segmentation_weibo;

import java.util.concurrent.ArrayBlockingQueue;

import org.entity.bean.Postswords;
import org.entity.bean.Postswords_seg;
import org.entity.bean.Words;


public class FilterThread extends Thread {
	private ArrayBlockingQueue<Postswords_seg> in_queue;
	private ArrayBlockingQueue<Postswords_seg> out_queue;
	
	public FilterThread(ArrayBlockingQueue<Postswords_seg> postQueue,
			ArrayBlockingQueue<Postswords_seg> segQueue) {
		this.setDaemon(true);
		this.in_queue=postQueue;
		this.out_queue=segQueue;
	}
	
	public void run(){
		while(true){
			TestMain tm = new TestMain();
			Postswords_seg obj=new Postswords_seg();
			try {
				if(in_queue.isEmpty())continue;
				obj = in_queue.take();
				System.out.println("filterthread in_queue.size :"+in_queue.size());
				if(obj.getSPos()==null || obj.getWords()=="")continue;
				int choose = tm.testICTCLAS_ParagraphFilt(obj.getWords(), obj.getSPos());
				System.out.println(obj.getWords()+"//"+ obj.getSPos());
				System.out.println(choose);
				if(choose == 1){
					out_queue.put(obj);
				}
			} catch (InterruptedException e) {
//					 TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
