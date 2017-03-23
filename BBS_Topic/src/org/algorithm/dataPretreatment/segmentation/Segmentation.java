package org.algorithm.dataPretreatment.segmentation;
import java.util.ArrayList;
import java.sql.Timestamp;
import java.util.concurrent.ArrayBlockingQueue;

import org.entity.bean.Posts;
import org.entity.bean.Postswords_seg;
import org.util.MyUtil;
import org.util.MysqlConn;

import ICTCLAS.I3S.AC.ICTCLAS50;
public class Segmentation extends Thread {
	ArrayBlockingQueue<Posts> in_queue;
	private ArrayBlockingQueue<Postswords_seg> out_queue;
	private ICTCLAS50 testICTCLAS50;
	
	public Segmentation(ArrayBlockingQueue<Posts> postQueue,
			ArrayBlockingQueue<Postswords_seg> segQueue, ICTCLAS50 testICTCLAS50) {
		this.setDaemon(true);
		this.in_queue=postQueue;
		this.out_queue=segQueue;
		this.testICTCLAS50 = testICTCLAS50;
	}
	
	public void run() {
		MysqlConn cnn = new MysqlConn();
		while (true) {
			TestMain tm = new TestMain();
			Posts obj = new Posts();
			int ff = 0; // 标记是否对象obj为空
			try {
				obj= in_queue.take();
				ff = 1;
				if (obj.equals(null)) {
					ff = 0;
					continue;
				}
				if (ff == 1) {
					String subid = obj.getSubId();
					String topicid = obj.getTopicId();
					if (subid.equals(topicid)) {
						for (Postswords_seg e1 : tm.segmentationTitle(obj.getTitle(), testICTCLAS50)) {
							e1.setSegtime(new Timestamp(System.currentTimeMillis()));
							e1.setPid(obj.getPid());
							e1.setPosition("title");
							e1.setIssuetime(obj.getIssuetime());
							e1.setTopicID(topicid);
							out_queue.put(e1);
						}
					}
					if (obj.getContent().equals(null)){
						cnn.update_posts(obj.getPid(),"1");
						continue;
					}
					for (Postswords_seg e2 : tm.segmentationContent(obj.getContent(), testICTCLAS50)) {
						e2.setSegtime(new Timestamp(System.currentTimeMillis()));
						e2.setPid(obj.getPid());
						e2.setPosition("content");
						e2.setIssuetime(obj.getIssuetime());
//						System.out.println(obj.getIssuetime());
						e2.setTopicID(topicid);
						out_queue.put(e2);
					}
					cnn.update_posts(obj.getPid(),"1");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
