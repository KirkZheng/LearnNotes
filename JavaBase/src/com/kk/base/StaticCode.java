package com.kk.base;

public class StaticCode{
	//定义静态变量
	public static String staticField="静态变量";
	//定义变量
	public static String field="变量";
	//静态变量初始化块
	static {
		System.out.println(staticField);
		System.out.println("静态变量初始化块");
	}
	//初始化块
	{
		System.out.println(field);
		System.out.println("变量初始化块");
	}
	//创建构造器
	public StaticCode() {
		System.out.println("构造器");
	}
	public static void main(String[] args) {
		new StaticCode();
	}
}
