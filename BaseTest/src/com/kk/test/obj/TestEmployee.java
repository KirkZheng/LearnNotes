package com.kk.test.obj;

public class TestEmployee {
	public static void main(String[] args) {
		//多态的用法,子类去调用抽象类子类的方法属性
		Employee e=new Programmer();
		//给程序员子类赋值，实例化
		e.setName("张山");
		e.setNum(001);
		
		//这里调用的是父类的方法
		e.eat();
		//自己特有的方法
		e.work();
	}
}
