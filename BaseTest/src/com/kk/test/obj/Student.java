package com.kk.test.obj;

public class Student {
	//创建静态变量count记录初始化次数
	static int count;
	public Student(){
		count++;
		System.out.println("第"+count+"次初始化方法");
	}
}
