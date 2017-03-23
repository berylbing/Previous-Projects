package org.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class MyUtil {

	//格式化时间格式
	public static String toString(Timestamp date){
		SimpleDateFormat sdf  =   new  SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" ); 
		String str = sdf.format(date);
		return str;
	}
}
