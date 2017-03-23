package org.algorithm.dataPretreatment.crawler;

import java.util.concurrent.ArrayBlockingQueue;

public class Analysisbbs extends Thread{
	private ArrayBlockingQueue<String> queue;
	private String board;
	private String board_pre;
	public Analysisbbs(ArrayBlockingQueue<String> queue,String board,String board_pre){
		this.setDaemon(true);
		this.queue=queue;
		this.board=board;
		this.board_pre=board_pre;
	}
	public void run(){
		MyParser parser=new MyParser();
		try{
			//System.out.println("parser.harvestBoardLink(board, board_pre).size()");
			//System.out.println(parser.harvestBoardLink(board, board_pre).size());
			for(String link:parser.harvestBoardLink(board, board_pre)){
				queue.put(link);
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
