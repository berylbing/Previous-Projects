package org.algorithm.dataPretreatment.segmentation_weibo;
import java.sql.Timestamp;
import java.util.concurrent.ArrayBlockingQueue;

import org.entity.bean.Posts;
import org.entity.bean.Postswords_seg;
import org.entity.bean.Weibos;
import org.entity.bean.Weiboswords_seg;
import org.util.MysqlConn;

import ICTCLAS.I3S.AC.ICTCLAS50;
public class Segmentation extends Thread {
	ArrayBlockingQueue<Weibos> in_queue;
	private ArrayBlockingQueue<Weiboswords_seg> out_queue;
	private ICTCLAS50 testICTCLAS50;
	
	public Segmentation(ArrayBlockingQueue<Weibos> postQueue,
			ArrayBlockingQueue<Weiboswords_seg> segQueue, ICTCLAS50 testICTCLAS50) {
		this.setDaemon(true);
		this.in_queue=postQueue;
		this.out_queue=segQueue;
		this.testICTCLAS50 = testICTCLAS50;
	}
	
	public void run() {
		MysqlConn cnn = new MysqlConn();
		while (true) {
			TestMain tm = new TestMain();
			Weibos obj = new Weibos();
			int ff = 0; // 标记是否对象obj为空
			try {
				obj= in_queue.take();
				ff = 1;
				if (obj.equals(null)) {
					ff = 0;
					continue;
				}
				if (ff == 1) {
					if (obj.getText().equals(null)){
						cnn.update_posts_weibo(obj.getWid(),"1");
						continue;
					}
					for (Weiboswords_seg e1 : tm.segmentationContent(obj.getText(), testICTCLAS50)) {
						e1.setSegtime(new Timestamp(System.currentTimeMillis()));
						e1.setPid(obj.getWid());
						e1.setPosition("title");
						e1.setIssuetime(obj.getCreateddate());
						e1.setTopicID(obj.getParentid());
						out_queue.put(e1);
					}
					cnn.update_posts_weibo(obj.getWid(),"1");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
