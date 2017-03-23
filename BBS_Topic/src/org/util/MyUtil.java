package org.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class MyUtil {
//��ʽ��ʱ��
	public static String toString(Timestamp date){
		SimpleDateFormat sdf=new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
		String str=sdf.format(date);//Format a date to a date/time string
		return str;
	}
	//�������������date����
	public static int getIntervalTimes(Timestamp startday,Timestamp endday){
		if(startday.after(endday)){
			return -1;
		}
		long e1=startday.getTime();//getTime�������ش� Timestamp �����ʾ���� 1970 �� 1 �� 1 �� 00:00:00 GMT �����ĺ�����
		long e2=endday.getTime();
		long t1=e2-e1;
		return (int)(t1/(1000*60*60*24));
	}
	//�������������Timestamp����,ֻ����day���ֺ���ʱ��
	@SuppressWarnings("deprecation")
	public static int getIntervalDays(Timestamp startday,Timestamp endday){
		if(startday.after(endday)){
			Timestamp cal=startday;
			startday=endday;
			endday=cal;
		}
		startday.setHours(0);
		startday.setMinutes(0);
		startday.setSeconds(0);
	    endday.setHours(0);
	    endday.setMinutes(0);
	    endday.setSeconds(0);
	    long el=startday.getTime()/(1000*60*60*24);
	    long e2=endday.getTime()/(1000*60*60*24);      
        long t1=e2-el;  
        return (int)(t1);
	}
	//����ʱ��Ӽ�����   startday�ĸ�ʽ�ǡ�2011-04-10 00:00:00��
	public static String addIntervalDays(String start,int slot){
		Timestamp startday=Timestamp.valueOf(start);// ��ʹ�� JDBC ʱ���ת���ʽ�� String ����ת��Ϊ Timestamp ֵ��
		long temp=slot*86400000;
		temp=startday.getTime()+temp;
		startday.setTime(temp);//setTime�������ô� Timestamp �����Ա�ʾ 1970 �� 1 �� 1 �� 00:00:00 GMT �Ժ� time �����ʱ���
		String end=toString(startday);
		return end;
	}
	public static String minusIntervalDays(String start,int slot){
		Timestamp startday=Timestamp.valueOf(start);
		long temp=slot*86400000;//1天的时间间隔
		temp=startday.getTime()-temp;
		startday.setTime(temp);
		String end=toString(startday);
		return end;
	}
	/**
	 * @param vector ������ʾ
	 * @param n  ������ά��
	 */
	public static double[] stringTodoublearr(String vector,int n){
		double topicsarr[]=new double[n];
		String tempd[]=vector.split(",");
		int i=0;
		for(String str:tempd){
			topicsarr[i]=Double.valueOf(str);
			i++;
		}
		return topicsarr;
	}
	public static String doublearrToVector(double[] darr, int n){
		String vector = Double.toString(darr[0]);
		for(int iv = 1; iv < n; iv++){
			vector = vector + ",";
			vector = vector + Double.toString(darr[iv]);
		}
		return vector;
	}
	public static void main(String[] args) {
		//System.out.println(minusIntervalDays("2011-04-11 00:00:00",1));
	}
}
