package org.algorithm.dataPretreatment.crawler;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Timestamp;

import org.entity.bean.Posts;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class MyParser {

//	private String board_pre = "http://bbs.xjtu.edu.cn/BMYAXPSNOFWOHFJQQCBBWMQOLESYNICFESMC_B/tdoc?B=";
	
	public ArrayList<String> harvestBoardLink(String board ,String board_pre) throws Exception{
		ArrayList<String> rst=new ArrayList<String>();
		Document doc = null;
		String pageurl=board_pre+board;
		int n = 500;		//获取n页数据
		String starttime = "Tue Jan 10 00:00:00 2012";
		String endtime = "Tue Jan 17 00:00:00 2012";
		while(n-->0){	
			try {
					doc = Jsoup.connect(pageurl).timeout(1000*60*2).get();
					//System.out.println(pageurl);
					for(int i = 0; i<5&& doc==null; i++){
						Thread.sleep(1000);
						doc = Jsoup.connect(pageurl).get();
						System.out.println("null");
					}
					if(doc == null) {
						System.out.println("break!!!!");
						break;
					}
//				}
			
			//判断时间,取每页第一个主题帖的时间，后面那个2011是个bug需要回头修改！！！！！！！！
			Elements links = doc.select("td");
			ArrayList<String> daylist = new ArrayList<String>();
			for(int i=0; i<links.size();i++){
				String strele = links.get(i).text();
				if(strele.split(" ").length == 2){
					if(this.choosetime(strele.split(" ")[0])==1){
						//Thu Jan 20 15:16:16 2011
						String day = "Thu "+strele+" 15:16:16 2012";
						daylist.add(day);
//					System.out.println("links.get(i).text():"+day);
					}
				}
			}
//			System.out.println("links.get(i).text():"+daylist.get(0));
			int len = daylist.size();
			if(this.dateformat(starttime).after(this.dateformat(daylist.get(0)))) {
//				System.out.println("starttime"+daylist.get(0));
				Elements listvv = doc.select("a");
				for(int i = 0; i<listvv.size(); i++){
					Element e=listvv.get(i);
					String link =e.attr("href");
					if(e.html().equals("上一页")){
						pageurl = board_pre.split("tdoc?")[0] + link;
						System.out.println(pageurl);
					}
				}
				break;}
			if(this.dateformat(daylist.get(len-1)).after(this.dateformat(endtime))) {
//				System.out.println("endtime:"+daylist.get(len-1));
				Elements listvv = doc.select("a");
				for(int i = 0; i<listvv.size(); i++){
					Element e=listvv.get(i);
					String link =e.attr("href");
					if(e.html().equals("上一页")){
						pageurl = board_pre.split("tdoc?")[0] + link;
						System.out.println(pageurl);
					}
				}
				continue;}
			Elements links2 = doc.select("td");
			for(int i=0; i<links2.size();i++){
				String strele = links2.get(i).text();
				if(strele.split(" ").length == 2){
					if(this.choosetime(strele.split(" ")[0])==1){
						//Thu Jan 20 15:16:16 2011
						String day = "Thu "+strele+" 15:16:16 2012";
					//System.out.println("links2.get(i).text():"+day);
					}
				}
			}
			
			Elements list = doc.select("a");
			for(int i = 0; i<list.size(); i++){
				Element e=list.get(i);
				String link =e.attr("href");
				if(e.html().equals("上一页")){
					pageurl = board_pre.split("tdoc?")[0] + link;
					System.out.println(pageurl);
				}
				String link0 = link.split("[?]")[0];
				//System.out.println(link0);
				if(link0.equals("bbstcon")){
					rst.add(board_pre.split("tdoc?")[0] + link);
					//System.out.println(rst.size());
					//System.out.println(board_pre.split("tdoc?")[0] + link);
				}
			}
			//System.out.println(rst.size());
			} catch (Exception e) {
				e.printStackTrace();
				//System.out.println("sdfsd2f"+rst.size());
			} 
		}
		//System.out.println("sdfsdf"+rst.size());
		return rst;
	}
	
	public ArrayList<Posts> harvestPost(String url) throws Exception{
		String starttime = "Tue Jan 10 00:00:00 2012";
		String endtime = "Tue Jan 17 00:00:00 2012";
		boolean pageflag =true;
		ArrayList<Posts> rst=new ArrayList<Posts>();
//		int interval = 10;   //获取数据时间，30
		while(pageflag){
			String topicid = url.split("&th=",2)[1];
			String board = (url.split("board=",2)[1]).split("&start=")[0];
			Document doc = null;
			try {
				doc = Jsoup.connect(url).timeout(1000*60*2).get();
				for(int i = 0; i<5&& doc==null; i++){
					Thread.sleep(1000);
					doc = Jsoup.connect(url).get();
					System.out.println("null");
				}
				if(doc == null) {
					System.out.println("break!!!!");
					break;
				}
			
			int flag = 0;
			for(String item:doc.html().split("<table width=\"95%\" cellpadding=\"5\" cellspacing=\"0\"> ")){
				/**解析并保存入对象
				 * 
				 */
				if (flag==0){
					flag++;
					continue;
				}
				Posts bbs = new Posts();
				bbs.setTopicId(topicid);
				bbs.setBoard(board);
				//subid and url
				Document doc0 = Jsoup.parseBodyFragment(item);
				Elements links = doc0.select("a[href]");
				for(int i = 0; i<links.size(); i++){
					String pre = "http://bbs.xjtu.edu.cn/BMYAALHELAJMNESDBCQHJDFBLDGQBBTBOGZR_B/";
					if(links.get(i).html().equals("本篇全文")){
						String temp =links.get(i).toString().split("F=M.")[1];
						bbs.setSubId(temp.split(".A")[0]);
						bbs.setUrl(pre+links.get(i).attr("href"));
					}
				}
				//username and userid
				links = doc0.select("td");
				String temp ="";
				if(links.get(0).text().split("本篇作者: ").length>1) {
					temp=links.get(0).text().split("本篇作者: ")[1];
					bbs.setAuthorId(temp.split(" 本篇星级")[0]);
					bbs.setAuthorname(temp.split(" 本篇星级")[0]);
					}
				else{
					temp=links.get(0).text();
					bbs.setAuthorId(temp.split(" 本篇星级")[0]);
					bbs.setAuthorname(temp.split(" 本篇星级")[0]);
				}
				//querytime
				Timestamp datenow = new Timestamp(System.currentTimeMillis());
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(datenow);
				bbs.setQuerytime(datenow);
				//title
				if(links.get(1).text().split("标  题: ").length>1) {
					temp=links.get(1).text().split("标  题: ")[1];
					String bbstitle = temp.split("发信站:")[0];
//					if(bbstitle.isEmpty()) continue;
//					if(bbstitle==null)continue;
//					if(bbstitle.equals(null))continue;
					bbs.setTitle(bbstitle);	
				}
				else {
					temp = links.get(1).text();
					String bbstitle = temp.split("发信站:")[0];
					bbs.setTitle(bbstitle);	
					System.out.println(bbs.getTitle());
				}
				//issuetime
//				System.out.println(temp);
				if(temp.split("发信站: 兵马俑BBS \\(").length<2)continue;
//				if(temp.split("发信站: 兵马俑BBS自动发信系统|发信站: 自动发信系统").length>1)continue;
				temp=temp.split("发信站: 兵马俑BBS \\(")[1];
				String issuetime = temp.split("\\), ")[0];
				//指定热点讨论时间
//				int intervaltemp = MyUtil.getIntervalDays(datenow, dateformat(issuetime));
//				if(intervaltemp > interval) continue;
				if(this.dateformat(starttime).after(this.dateformat(issuetime)))continue;
				if(this.dateformat(issuetime).after(this.dateformat(endtime))) continue;
				bbs.setIssuetime(dateformat(issuetime));
//				System.out.println(issuetime.toString());
				System.out.println(bbs.getIssuetime());
				//content
				if(temp.split("本站\\(\\d+.\\d+.\\d+.\\d+\\) |本站\\(bbs.xjtu.edu.cn\\) ").length<2)continue;
				temp=temp.split("本站\\(\\d+.\\d+.\\d+.\\d+\\) |本站\\(bbs.xjtu.edu.cn\\) ")[1];
				//去掉之后的引用“在XXX大作中提到”
				String temp2 = temp.split("---※ ")[0];
				temp2 = temp2.split("※")[0];
				temp2 = temp2.split(": 】")[0];//-- ※ 
				if(temp2.endsWith(" 的大作中提到")) temp2 = temp2.split("【")[0];
				//去掉转帖的家伙
				if(temp2.split("发表 】").length>1)
				 temp2 = temp2.split("发表 】")[1];
				if(temp2.split("发表】").length>1)
					 temp2 = temp2.split("发表】")[1];
				String bbscontent = temp2.split("-- ※ ")[0];
//				if(bbscontent.isEmpty()) continue;
//				if(bbscontent==null)continue;
//				if(bbscontent.equals(null))continue;
				bbs.setContent(bbscontent);
				System.out.println(bbs.getContent());
				//ip
				links = links.get(1).select("font");
				for(int i = 0; i<links.size(); i++){
					if(links.get(i).html().startsWith("※ 来源")){
						temp =links.get(i).text().split("\\[FROM: ")[1];
						bbs.setUrl(temp.split("\\]")[0]);
					}
				}
				
				rst.add(bbs);
				//System.out.println(rst.size());
			}
			Elements links = doc.select("a[href]");
			pageflag =false;
			for(int i = 0; i<links.size(); i++){
//				String pre = "http://bbs.xjtu.edu.cn/BMYAALHELAJMNESDBCQHJDFBLDGQBBTBOGZR_B/";
				if(links.get(i).html().equals("下页")){
					url = "http://bbs.xjtu.edu.cn/BMYBJIBHQJDGCRVFVIQSVRHROIWJLRWXLQPS_B/"+links.get(i).attr("href");
					//System.out.println(url);
					pageflag = true;
				}
			}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//System.out.println("rst.size()"+rst.size());
		return rst;
	}
	
	/**
	 * 日期字符串转换
	 * 日期格式："Thu Jan 20 15:16:16 2011"
	 */
	public Timestamp dateformat(String str) throws ParseException{
		String mm = str.split(" ")[1];
		if(mm.equals("Jan")) mm="01";
		if(mm.equals("Feb")) mm="02";
		if(mm.equals("Mar")) mm="03";
		if(mm.equals("Apr")) mm="04";
		if(mm.equals("May")) mm="05";
		if(mm.equals("Jun")) mm="06";
		if(mm.equals("Jul")) mm="07";
		if(mm.equals("Aug")) mm="08";
		if(mm.equals("Sep")) mm="09";
		if(mm.equals("Oct")) mm="10";
		if(mm.equals("Nov")) mm="11";
		if(mm.equals("Dec")) mm="12";
		String dd = str.split(" ")[2];
		while(dd.startsWith(" ")){
			dd = dd.substring(1);
		}
		if(dd.length()==1){
			if(dd.endsWith("1")) dd="01";
			if(dd.endsWith("2")) dd="02";
			if(dd.endsWith("3")) dd="03";
			if(dd.endsWith("4")) dd="04";
			if(dd.endsWith("5")) dd="05";
			if(dd.endsWith("6")) dd="06";
			if(dd.endsWith("7")) dd="07";
			if(dd.endsWith("8")) dd="08";
			if(dd.endsWith("9")) dd="09";
		}
		if(dd.length()==2){
			if(dd.startsWith("1")){
				if(dd.endsWith("0")) dd="10";
				if(dd.endsWith("1")) dd="11";
				if(dd.endsWith("2")) dd="12";
				if(dd.endsWith("3")) dd="13";
				if(dd.endsWith("4")) dd="14";
				if(dd.endsWith("5")) dd="15";
				if(dd.endsWith("6")) dd="16";
				if(dd.endsWith("7")) dd="17";
				if(dd.endsWith("8")) dd="18";
				if(dd.endsWith("9")) dd="19";
			}
			if(dd.startsWith("2")){
				if(dd.endsWith("0")) dd="20";
				if(dd.endsWith("1")) dd="21";
				if(dd.endsWith("2")) dd="22";
				if(dd.endsWith("3")) dd="23";
				if(dd.endsWith("4")) dd="24";
				if(dd.endsWith("5")) dd="25";
				if(dd.endsWith("6")) dd="26";
				if(dd.endsWith("7")) dd="27";
				if(dd.endsWith("8")) dd="28";
				if(dd.endsWith("9")) dd="29";
			}
			if(dd.startsWith("3")){
				if(dd.endsWith("0")) dd="30";
				if(dd.endsWith("1")) dd="31";
			}
		}
		
//		SimpleDateFormat sdf  =   new  SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" ); 
		String str0 = str.split(" ")[3];//HH:mm:ss
		String str1 = str.split(" ")[4]+"-"+mm+"-";
		str = str1 +dd+" "+str0;
		Timestamp date = null;
		date = Timestamp.valueOf(str);
//			date = (Timestamp) sdf.parse(str);
		return date;
	}
	/**
	 * 是否选择为时间
	 * 日期格式："Jan 20"
	 * return 1 choose;
	 * return 0 no;
	 */
	public int choosetime(String mm){
		int choose = 0;
		if(mm.equals("Jan")) choose = 1;
		if(mm.equals("Feb")) choose = 1;
		if(mm.equals("Mar")) choose = 1;
		if(mm.equals("Apr")) choose = 1;
		if(mm.equals("May")) choose = 1;
		if(mm.equals("Jun")) choose = 1;
		if(mm.equals("Jul")) choose = 1;
		if(mm.equals("Aug")) choose = 1;
		if(mm.equals("Sep")) choose = 1;
		if(mm.equals("Oct")) choose = 1;
		if(mm.equals("Nov")) choose = 1;
		if(mm.equals("Dec")) choose = 1;
		return choose;
	}

	public static void main(String[] args) throws Exception {
//		// TODO Auto-generated method stub
		String posts ="http://bbs.xjtu.edu.cn/BMYAGSEIBQCKLIMTUTFBKLMOKOFJCZCWHXWN_B/bbstcon?board=XJTUgrd&start=10084&th=1330867528";
		String board_pre = "http://bbs.xjtu.edu.cn/BMYAXPSNOFWOHFJQQCBBWMQOLESYNICFESMC_B/tdoc?B=";
		board_pre = "http://bbs.xjtu.edu.cn/BMYAGSEIBQCKLIMTUTFBKLMOKOFJCZCWHXWN_B/bbstdoc?board=XJTUgrd&S=4399";
		MyParser my = new MyParser();
		my.harvestPost(posts);
//		String board = "XJTUnews";
//		MyParser my = new MyParser();
//		for(String str :my.harvestBoardLink(board,board_pre)){
////			System.out.println(str);
//		}
		//Timestamp time = new Timestamp(System.currentTimeMillis());
//		Timestamp now = new Timestamp(System.currentTimeMillis());
		//time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(time);
		//System.out.println(time);
		
	}
}
