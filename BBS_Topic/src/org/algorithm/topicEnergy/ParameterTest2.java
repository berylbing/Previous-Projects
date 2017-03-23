package org.algorithm.topicEnergy;
import java.sql.Timestamp;
import java.util.ArrayList;

import org.algorithm.topicDetected.cluster.Energy;
import org.algorithm.topicDetected.cluster.Test;
import org.algorithm.topicDetected.cluster.TextSimilarity;
import org.algorithm.topicDetected.cluster.TfIdf;
import org.entity.bean.Postswords;
import org.entity.bean.Topics;
import org.entity.bean.Topicsposts;
import org.entity.bean.Words;
import org.entity.bean.Vector;
import org.entity.other.Tempclass;
import org.util.Configer;
import org.util.MyUtil;
import org.util.MysqlConn;
import org.util.UUIDKey;

public class ParameterTest2 {
	public int find_N(double weight){
		int n =0;
		MysqlConn conn = new MysqlConn();
		n = conn.select_findbyweight(weight).size();  //权重大于4的所有词的个数 from words
		if(n>20000)
			n=20000;
		return n;
	}
	
public Vector test_parameter(){
	MysqlConn conn = new MysqlConn();
	ArrayList<Vector> al = conn.select_vector();
	Vector vtl=new Vector();
	String topicID;
	int config_n=find_N(4.46);
	TextSimilarity testsim = new TextSimilarity();
	for(Vector vt:al){
		double sum=0;
		String vector=vt.getVector();	
		double a[]= MyUtil.stringTodoublearr(vector,config_n);
			for(Vector vta:al){
			String vector2=vta.getVector();
			double b[]=MyUtil.stringTodoublearr(vector2,config_n);
			double sim=testsim.sim(a, b, config_n);
			sum+=sim;
	     }
	    topicID=vt.getTopicID();
	    System.out.println(topicID);
		System.out.println(sum);
		vtl.setTopicID(topicID);
		vtl.setSimilarity(sum);
		conn.insertintovector(sum,topicID);
	}
	return vtl;
}
public static void main(String[] args) {
	ParameterTest2 test=new ParameterTest2();
	test.test_parameter();
}
}
