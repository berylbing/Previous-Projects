package com.ht706.componentLibrary.forum.bo;

import java.util.List;

import com.ht706.componentLibrary.forum.bean.hbm.ForumBulletin;

public interface IForumBulletinService {
	public List<ForumBulletin> getForumBulletinList();
	public ForumBulletin getFuromBulletinByBulletinId(int bulletinId);
	public void createBulletin(ForumBulletin forumBulletin);
	public void deleteBulletinByBulletinId(ForumBulletin forumBulletin);
}
