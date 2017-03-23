package org.search;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;

import org.entity.Answers;
import org.entity.Pattern;
import org.entity.Questions;
import org.util.MysqlConn;
import org.util.UUIDKey;

public class Search_main {

	/**
	 * 传入的参数：String question 问题语句
	 * 返回：List<Answers>
	 * 步骤：
	 * 1.分词  得到结果list
	 * 2.用模式遍历list 得到模式类型及关键名词
	 * 3.在数据库中搜索模式类型及关键名词；
	 * 若数据库中存在，则返回查询结果对象list（Answers）；
	 * 若不存在，则进入网页搜索答案模式，将问题和搜索到的答案list存入数据库，并返回结果对象list（Answers）
	 * 
	 * 注：目前的版本只匹配单一模式，并且采用顺序的方式进行，不支持线程；
	 *     本程序没有做意外处理
	 */
	/**
	 * @param args
	 * @throws IOException 
	 */
	public ArrayList<Answers> Question_search(String question) throws IOException{
		ArrayList<String> question_list = Segmentation.testICTCLAS_ParagraphProcess(question);
		ArrayList<Pattern> pattern_list = new ArrayList<Pattern>();
		ArrayList<String> keyword_list = new ArrayList<String>();
		ArrayList<Answers> answer_list = new ArrayList<Answers>();
		Parser parser = new Parser();
		MysqlConn mysql = new MysqlConn();
//		for(String e : question_list){
//			System.out.println(e);
//		}
		/******************
		 * 查找问题模式类型
		 *************/
		pattern_list = mysql.select_patternBypriority(1);
		//System.out.println(mysql.select_patternBypriority(1).size());
		for(Pattern pat : pattern_list){
			for(String str : question_list){
				String temp = str.split("/")[0];
				if(pat.getKeyword().equals(temp)){
					break;
				}
			}
			
			//在里面检查优先级低的
			if(pat.getType().equals("what")){
				for(String str : question_list){
					String temp = str.split("/")[1];
					if(temp.equals("un")||temp.startsWith("n")){
						keyword_list.add(str.split("/")[0]);
					}
				}
				String keyword = keyword_list.get(0); //暂时按照名词唯一来做的
				/***********
				 * 在数据库中查找答案
				 ************/
				String qid = "";
				if(!mysql.select_questionsBykeyword(keyword).isEmpty()){
					qid = mysql.select_questionsBykeyword(keyword).get(0).getQid(); //暂时按照问题唯一来做的
					answer_list = mysql.select_answersBytype(qid, pat.getType());
				}
				/**********
				 * 在网页中搜索答案
				 ***********/
				if(answer_list.isEmpty()){
					System.out.println("empty");
					String[] answer_baidu = parser.parser_baike(keyword);
					//answer_baidu = "百度+++++" + pat.getType() + "+++++" + answer_baidu;
//					String nqid = indb.save_question(keyword);
//					Answers ans = indb.save_answer(answer_baidu, nqid);
					if(mysql.select_questionsBykeyword(keyword).isEmpty()){
						Questions qus = new Questions();
						UUIDKey uuid1 = UUIDKey.getInstance();
						qid = uuid1.getNewUUID();
						qus.setAttr1("");
						qus.setAttr2("");
						qus.setKeyword(keyword);
						qus.setQid(qid);
						mysql.save_questions(qus);
					}
					Answers ans = new Answers();
					UUIDKey uuid2 = UUIDKey.getInstance();
					String aid = uuid2.getNewUUID();
					ans.setAid(aid);
//					String content = answer_baidu.split(" #+# ")[1];
					ans.setContent(answer_baidu[1]);
					ans.setOthers("");
					ans.setQid(qid);
					ans.setSearchtime(new Timestamp(System.currentTimeMillis()));
					ans.setSource("百度");
					ans.setType(pat.getType());
					ans.setUrl(answer_baidu[0]);
					ans.setWeight(0);
					System.out.println(ans.getUrl());
					mysql.save_answers(ans);
					
					answer_list.add(ans);
				}
				
				break;
			}
			
		}
		return answer_list;
			
		
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Search_main s = new Search_main();
		s.Question_search("百度是什么？");
	}

}
