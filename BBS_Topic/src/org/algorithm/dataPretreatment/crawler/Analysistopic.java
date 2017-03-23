package org.algorithm.dataPretreatment.crawler;

import java.util.concurrent.ArrayBlockingQueue;
import org.entity.bean.Posts;

public class Analysistopic extends Thread{
	private ArrayBlockingQueue<String> in_queue;
	private ArrayBlockingQueue<Posts> out_queue;
	public Analysistopic(ArrayBlockingQueue<String> in_queue,ArrayBlockingQueue<Posts> out_queue){
		this.setDaemon(true);
		this.in_queue=in_queue;
		this.out_queue=out_queue;
	}
	public void run(){
		MyParser parser=new MyParser();
		try{
			while(true){
				String link=in_queue.take();
				for(Posts e:parser.harvestPost(link)){
					out_queue.put(e);
					//System.out.println(e.getUrl());
				}
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Analysistopic");
	}
}
