package org.entity.bean;
import java.sql.Timestamp;
import org.entity.bean.abstractBean.AbstractPosts;
/**
 * posts entity
 * @author huangli
 *
 */
public class Posts extends AbstractPosts implements java.io.Serializable{
public Posts(){}
public Posts(String subId, String topicId, String url, String board,
			String title, String authorId, String authorname, String content,
			Timestamp issuetime, Timestamp querytime,Integer flag) {
		super(subId, topicId, url, board, title, authorId, authorname, content,
				issuetime, querytime,flag);
}
}
