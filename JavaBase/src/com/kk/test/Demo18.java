package com.kk.test;

public class Demo18 {
	//静态代码块
	public Demo18() {
		System.out.println("18的构造方法");
	}
	{
		System.out.println("18的构造代码块");
	}	
	static {
		System.out.println("18的静态代码块");
	}
	public static void main(String[] args) {
		//优先级顺序
		//静态代码块》构造代码块》构造函数
		Demo18 d=new Demo18();
		Demo18 b=new Demo18();
	}
}
