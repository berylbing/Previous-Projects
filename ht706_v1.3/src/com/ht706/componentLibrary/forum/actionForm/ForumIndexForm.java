package com.ht706.componentLibrary.forum.actionForm;

import java.util.List;

import org.apache.struts.action.ActionForm;

import com.ht706.componentLibrary.forum.bean.hbm.ForumBulletin;
import com.ht706.componentLibrary.forum.bean.hbm.ForumForum;

public class ForumIndexForm extends ActionForm{
	private List<ForumBulletin> forumBulletinList;
	private List<ForumForum> forumForumList;
	public void setForumBulletinList(List<ForumBulletin> forumBulletinList){
		this.forumBulletinList = forumBulletinList;
	}
	public List<ForumBulletin> getForumBulletinList(){
		return this.forumBulletinList;
	}
	public void setForumForumList(List<ForumForum> forumForumList) {
		this.forumForumList = forumForumList;
	}
	public List<ForumForum> getForumForumList() {
		return forumForumList;
	}
}
