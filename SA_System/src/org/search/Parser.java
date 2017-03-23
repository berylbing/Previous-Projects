package org.search;

import java.io.IOException;
import java.net.URLEncoder;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Parser {

	/**
	 * @author bing
	 * @param args
	 * @Time 2012-2-24
	 * @throws IOException
	 * 目前本程序只解析有百度名片的条目，并且只包含第一个意思
	 */
	public String[] parser_baike(String keyword) throws IOException{
		String str = keyword;
		System.out.println(keyword);
		String str1 = URLEncoder.encode(str,"gb2312");
		
		String url = "http://baike.baidu.com/searchword/?pic=1&sug=1&enc=gbk&word="+str1; 
	
		Document doc = null;
		doc = Jsoup.connect(url).timeout(1000*60*2).get();
		String text = doc.select("meta").last().attr("content").split("URL=")[1];
		
		url = "http://baike.baidu.com"+text;
		//System.out.println(url);
		//解析正确的百度名片
		if(text.split("flag").length==1){
			doc = Jsoup.connect(url).timeout(1000*60*2).get();
			text = doc.body().text().split("百科名片")[1];
			text = text.split("目录")[0];
		}
		String strxx[] = new String [2];
		//text = url+"  #+# "+text;
		//System.out.println(text);
		strxx[0] = url;
		strxx[1] = text;
		return strxx;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
