package org.algorithm.dataPretreatment.crawler;

import java.util.concurrent.ArrayBlockingQueue;
import org.entity.bean.Posts;
import org.util.MysqlConn;

public class InDB extends Thread{
	private ArrayBlockingQueue<Posts> out_queue;
	public InDB(ArrayBlockingQueue<Posts> out_queue){
		this.setDaemon(true);
		this.out_queue=out_queue;
	}
	public void run(){
		MysqlConn mycon=new MysqlConn();
		while(true){
			try{
				Posts obj=out_queue.take();
				System.out.println("db_queue:"+out_queue.size());
				if(obj==null)
					continue;
				obj.setFlag(0);
				mycon.save_posts(obj);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("indb");
		}
	}

}
