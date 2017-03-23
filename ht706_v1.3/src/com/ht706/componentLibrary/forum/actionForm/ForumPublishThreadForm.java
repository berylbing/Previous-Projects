package com.ht706.componentLibrary.forum.actionForm;

import org.apache.struts.action.ActionForm;

public class ForumPublishThreadForm extends ActionForm{
	private int forumId;
	private String forumName;
	private int topicId;
	private String topicName;
	private String content;
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return content;
	}
	public void setForumId(int forumId) {
		this.forumId = forumId;
	}
	public int getForumId() {
		return forumId;
	}
	public void setForumName(String forumName) {
		this.forumName = forumName;
	}
	public String getForumName() {
		return forumName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getTopicName() {
		return topicName;
	}
}
