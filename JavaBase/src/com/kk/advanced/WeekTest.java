package com.kk.advanced;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 注：格式化字符串存在区分大小写
对于创建SimpleDateFormat传入的参数：EEEE代表星期，如“星期四”；
MMMM代表中文月份，如“七月”；MM代表月份，如“07”；yyyy代表年份，如“2017”；dd代表天，如“05”
 * 
 */


public class WeekTest {
	public static void main(String[] args) {
		Date date=new Date();
		SimpleDateFormat dateFm=new SimpleDateFormat("EEEE");
		String currSun=dateFm.format(date);
		System.out.println(currSun);
	}
}
