package org.algorithm.dataPretreatment.segmentation_weibo;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

import org.entity.bean.Postswords;
import org.entity.bean.Postswords_seg;
import org.entity.bean.Weiboswords;
import org.entity.bean.Weiboswords_seg;
import org.entity.bean.Words;
import org.util.MysqlConn;
import org.util.UUIDKey;

public class InDBs extends Thread {
	private ArrayBlockingQueue<Weiboswords_seg> seg_queue;
	// protected PostswordsDAO pwdao = new PostswordsDAO();
//	protected WordsDAO wdao = new WordsDAO();

	// private XjtubbsDAO xjtubbsDAO;
	public InDBs(ArrayBlockingQueue<Weiboswords_seg> seg_queue) {
		this.setDaemon(true);
		this.seg_queue = seg_queue;
	}

	public void run() {
		while (true) {
			
			try {
				// System.out.println(seg_queue.take().getWord());
				// System.out.println("seg_queue.size():"+seg_queue.size());
				MysqlConn cnn1 = new MysqlConn();
				Weiboswords_seg pws = seg_queue.take();
				Weiboswords pw = new Weiboswords();
				Words word = new Words();
				UUIDKey uuid = UUIDKey.getInstance();
				String wid = uuid.getNewUUID();
				word.setWid(wid);
				word.setWord(pws.getWords());
				word.setSpos(pws.getSPos());
				// wdao.save(word);
				cnn1.save_words(word);
				
				MysqlConn cnn2 = new MysqlConn();
				ArrayList<Words> wordlist = cnn2.select_findbyword(pws.getWords());
				if (wordlist.size() == 0 && wordlist.isEmpty())
					pw.setWid(wid);
				else {
					Words word1 = wordlist.get(0);
					pw.setWid(word1.getWid());
				}
				pw.setPosition(pws.getPosition());
				pw.setPid(pws.getPid());
				pw.setSegtime(pws.getSegtime());
				pw.setWord(pws.getWords());
				pw.setIssuetime(pws.getIssuetime());
				pw.setTopicID(pws.getTopicID());
				// pwdao.save(pw);
				cnn2.save_postswords_weibo(pw);
//				cnn2.update_wordsissuetime(pw.getWid(), pws.getIssuetime());
				// System.out.println("indbs seg_queue.size :"+seg_queue.size());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// System.out.println("indb");
			// }

		}
	}
}