package org.search;

import org.entity.Answers;
import org.util.UUIDKey;

public class InDB {

	public void save_answer(String str, String qid){
//		Answers ans = new Answers();
//		UUIDKey uuid = UUIDKey.getInstance();
//		String aid = uuid.getNewUUID();
//		ans.setAid(aid);
//		ans.setContent(str.split("+++++")[3]);
//		ans.setOthers("");
//		ans.setQid(qid);
//		ans.setSearchtime(searchtime)
//		ans.setSource()
//		return ans;
	}
	

	public String save_question(String str){
		UUIDKey uuid = UUIDKey.getInstance();
		String qid = uuid.getNewUUID();
		
		return qid;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
