package com.ht706.componentLibrary.forum.bo;

import java.util.Date;
import java.util.List;

import com.ht706.componentLibrary.forum.bean.hbm.ForumTopic;

public interface IForumTopicService {
	public List<ForumTopic> getForumTopicListByForumId(int forumId);
	public ForumTopic getForumTopicByTopicId(int Id);
	public void modifyHitNum(int topicId);
	public void createTopic(ForumTopic forumTopic);
	public void deleteTopic(ForumTopic forumTopic);
}
