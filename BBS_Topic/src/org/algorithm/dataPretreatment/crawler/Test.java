package org.algorithm.dataPretreatment.crawler;


import org.entity.bean.Posts;

import java.util.concurrent.ArrayBlockingQueue;

public class Test {
	public static void main(String[] args) throws Exception{
		ArrayBlockingQueue<String> queue=new ArrayBlockingQueue<String>(100);
		ArrayBlockingQueue<Posts> post_queue=new ArrayBlockingQueue<Posts>(100);
		String board_pre="http://bbs.xjtu.edu.cn/BMYBKSBDDALNCHJSOFFEWVMHBUTQVNSFHBJZ_B/tdoc?B=";
		for(int i=0;i<1;i++){
			Analysisbbs producer=new Analysisbbs(queue,"XJTUnews",board_pre);
			System.out.println("init XJTUnews");
			producer.start();
		}
		for(int i=0;i<1;i++){
			Analysistopic consumer=new Analysistopic(queue,post_queue);
			consumer.start();
		}
		
		

		for(int i=0;i<1;i++){
			InDB indb = new InDB(post_queue);
			indb.start();
		}
		
		Thread.sleep(10000);
		while(!queue.isEmpty()||!post_queue.isEmpty()) Thread.sleep(10000);
		System.out.println("quit");
	}

}
