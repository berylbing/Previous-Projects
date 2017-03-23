package org.algorithm.dataPretreatment.crawler;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ArrayBlockingQueue;

import org.entity.bean.Posts;
import org.util.Configer;

public class Crawler {
	 public static void main(String[] args) throws Exception{
	   String board_pre="http://bbs.xjtu.edu.cn/BMYBKSBDDALNCHJSOFFEWVMHBUTQVNSFHBJZ_B/tdoc?B="; 
	   ArrayBlockingQueue<String> queue=new ArrayBlockingQueue<String>(500);
	   ArrayBlockingQueue<Posts> post_queue=new ArrayBlockingQueue<Posts>(1000);
	   FileInputStream fis1=new FileInputStream(Configer.work_dir+"board.txt");
	   DataInputStream in1=new DataInputStream(fis1);
	   BufferedReader br1=new BufferedReader(new InputStreamReader(in1,"GBK"));
	   String board=null;
	   while((board=br1.readLine())!=null){
		   Analysisbbs producer=new Analysisbbs(queue,board,board_pre);
		   System.out.println("init "+board);
		   producer.start();
	   }
	   br1.close();
	   in1.close();
	   fis1.close();
	   
	   for(int i=0;i<2;i++){
		   Analysistopic consumer=new Analysistopic(queue,post_queue);
		   consumer.start();
	   }
	   for(int i=0;i<3;i++){
		   InDB indb=new InDB(post_queue);
		   indb.start();
	   }
	   Thread.sleep(10000);
	   while(!queue.isEmpty()||!post_queue.isEmpty())
		   Thread.sleep(10000);
	   System.out.println("quit"); 
}
}
