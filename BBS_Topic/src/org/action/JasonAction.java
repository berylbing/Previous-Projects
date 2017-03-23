package org.action;

import java.util.ArrayList;
import java.util.List;

import org.entity.bean.Posts;
import org.entity.other.HottopicsGrid;
import org.util.MysqlConn;

import com.opensymphony.xwork2.ActionSupport;

public class JasonAction extends ActionSupport{

	private long results;  
	private List items; 
	public String execute(){  
	    MysqlConn conn = new MysqlConn();
//	    this.items=new ArrayList<Posts>(); 
//	    this.items = conn.select_postsbyID(134423, 134440);
//	    	this.items = new ArrayList<Words>();
//	    	this.items = conn.select_findbyweight(60);
	    this.items = new ArrayList<HottopicsGrid>();
	    HottopicsGrid e = new HottopicsGrid();
	    e.setEnergy(0.5902);
	    e.setEnergy0(0);
	    e.setEnergy1(0);
	    e.setEnergy2(0);
	    e.setEnergy3(0);
	    e.setEnergy4(0);
	    e.setEnergy5(0);
	    e.setEnergy6(0);
	    e.setEnergy7(0.4483);
	    e.setEnergy8(0.5902);
	    e.setNum(76);
	    e.setNum2(128);
	    e.setTitle("长久以来，位于西安长乐公园附近的【韩森冢】的墓主人身份扑朔迷离，从名医、名将到秦王，说法不一。近日，西安考古部门勘探时发现，韩森冢为“亚”字型大墓，为秦王陵。专家推测，墓主极有可能为秦始皇父亲秦庄襄王，或者祖父孝文王。既是秦王的墓，何以又称韩森冢呢？详细新闻http://t.cn/zOTgLPb");
	    items.add(e);
	    HottopicsGrid e2 = new HottopicsGrid();
	    e2.setTitle("【“五四”要来了 青年，你知道有半天假吗】以前五一耍七天，五 四青年节被掩盖在长假中，几乎被忽略。但现在五一变小假，5月4日这个属于青年们的节日，就应该被重视起来了。根据国家规定，这一天14至28周岁的青年，都要放假半天！还不知道的童鞋，请举个爪求放假！！！");
	    e2.setEnergy(0.3223);
	    e2.setEnergy0(0);
	    e2.setEnergy1(0);
	    e2.setEnergy2(0);
	    e2.setEnergy3(0);
	    e2.setEnergy4(0);
	    e2.setEnergy5(0.7863);
	    e2.setEnergy6(0.6094);
	    e2.setEnergy7(0.4650);
	    e2.setEnergy8(0.3223);
	    e2.setNum(22);
	    e2.setNum2(116);
	    items.add(e2);
	    HottopicsGrid e3 = new HottopicsGrid();
	    e3.setEnergy(0.2789);
	    e3.setEnergy0(0);
	    e3.setEnergy1(0);
	    e3.setEnergy2(0);
	    e3.setEnergy3(0);
	    e3.setEnergy4(0.6976);
	    e3.setEnergy5(0.7363);
	    e3.setEnergy6(0.5362);
	    e3.setEnergy7(0.5063);
	    e3.setEnergy8(0.2789);
	    e3.setNum(50);
	    e3.setNum2(128);
	    e3.setTitle("A.	【安康市美女交警执勤照片】帖子这几天火了。网友：“确实美！是我们安康的一大美景哟。”“为和她说话，一本地哥们还开过去问路呢。” 市民：“多亏她们的付出，不然操心孩子放学。对咯，接娃的男家长也多了。”[偷笑]网帖照片提到的美女交警就是22岁的安康姑娘张念");
	    items.add(e3);
	    HottopicsGrid e4 = new HottopicsGrid();
	    e4.setEnergy(0.0783);
	    e4.setEnergy0(0);
	    e4.setEnergy1(0);
	    e4.setEnergy2(0);
	    e4.setEnergy3(0);
	    e4.setEnergy4(0);
	    e4.setEnergy5(0);
	    e4.setEnergy6(0.6155);
	    e4.setEnergy7(0.2163);
	    e4.setEnergy8(0.0783);
	    e4.setNum(21);
	    e4.setNum2(78);
	    e4.setTitle("【咸阳机场15分钟内停车免费】据@芙蓉姐姐 提供的消息：5月3日起，西安咸阳机场实行15分钟内免费停车优惠。此前，@芙蓉姐姐 微博爆料称朋友在机场停车7分钟就收费8元，@华商网 记者跟进报道此事，引起了广大网友的关注。现在，咸阳机场新规发布，15分钟内停车免费了~[鼓掌]");
	    items.add(e4);
	    HottopicsGrid e5 = new HottopicsGrid();
	    e5.setEnergy(0.0391);
	    e5.setEnergy1(0);
	    e5.setEnergy0(0);
	    e5.setEnergy2(0);
	    e5.setEnergy3(0);
	    e5.setEnergy4(0);
	    e5.setEnergy5(0.5896);
	    e5.setEnergy6(0.4220);
	    e5.setEnergy7(0.2012);
	    e5.setEnergy8(0.0391);
	    e5.setNum(27);
	    e5.setNum2(49);
	    e5.setTitle("#西安冷笑话#据说是全国中学100强新鲜出炉！有没有你的母校？网传本排名是2011年中国教育部根据各地送审的754所省级重点高中，进行量化赋分，评出的中国中学100强。属于中国官方正式排名，非民间排名。西工大附中，交大附中，西安东方学校，博迪学校稳居后五名，这真心不是搞笑来的么？[嘻嘻]");
	    items.add(e5);
	    this.results = items.size();
	    System.out.println("sujjcess000");
	    return SUCCESS;  
	 }  
	public long getResults() {  
	    return results;  
	}  
	public void setResults(long results) {  
	    this.results = results;  
	}  
	public List getItems() {  
	    return items;  
	}  
	public void setItems(List items) {  
	    this.items = items;  
	}  
}
