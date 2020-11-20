package com.kk.test;

public class Demo19 {
	public void hi() {
		String address="广东";
		//创建内部类
		class Test{
			//创建内部类属性并赋值
			private String name="";
			//创建局部内部类方法
			public void show() {
				System.out.println(address);
				System.out.println(name);
			}
		}
	}
}
