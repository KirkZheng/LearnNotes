package com.kk.advanced;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {
	public static void main(String[] args) throws ParseException {
		//输入你要查询 的开始日期
		String dbtime1="2020-10-23";
		//定义要查询的终止日期
		String dbtime2="2018-05-06";
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		Date date1=format.parse(dbtime1);
		Date date2=format.parse(dbtime2);
		int a=(int)((date1.getTime()-date2.getTime())/(1000*3600*24));
		System.out.println(a);
	}
}
