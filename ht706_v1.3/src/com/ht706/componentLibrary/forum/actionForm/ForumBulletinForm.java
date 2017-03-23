/**
 * @FileName	announcementForm.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.forum.actionForm
 * @author О¤зв
 * @Time 2010-10-6	16:09
 */
package com.ht706.componentLibrary.forum.actionForm;
import java.util.List;

import org.apache.struts.action.ActionForm;

import com.ht706.componentLibrary.forum.bean.hbm.ForumBulletin;

public class ForumBulletinForm extends ActionForm{
		private String title;
		private String content;
		private int bulletinOrder;
		private List<ForumBulletin> forumBulletinList;
		public void setForumBulletinList(List<ForumBulletin> forumBulletinList){
			this.forumBulletinList = forumBulletinList;
		}
		public List<ForumBulletin> getForumBulletinList(){
			return this.forumBulletinList;
		}	
		public void setTitle(String title) {
			this.title = title;
		}
		public String getTitle() {
			return title;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getContent() {
			return content;
		}
		public void setBulletinOrder(int bulletinOrder) {
			this.bulletinOrder = bulletinOrder;
		}
		public int getBulletinOrder() {
			return bulletinOrder;
		}
}
