package com.kk.advanced;

public class Father {
	static {
		System.out.println("静态代码块");
	}
	{
		System.out.println("构造代码块");
	}
	
	public Father(){
		System.out.println("构造方法");
	}
	
	//输出整个类
	public static void main(String[] args) {
		//static可以直接输出
		//创建Father的对象并且输出
		Father f=new Father();
	}
}
