package com.kk.oop.test;

public class Dog extends Animal {
	String color;
	//Alt + shift +s
	
	public void run() {
		System.out.println("跑跑跑");
	}
	
	@Override
	public void eat() {
		System.out.println("狗在吃狗粮");
	}

	public Dog() {
		System.out.println("这个是狗类的无参构造方法");
	}

//	public String getColor() {
//		return color;
//	}
////
//	public void setColor(String color) {
//		this.color = color;
//	}
//
//	public Dog(String color) {
//		super();
//		this.color = color;
//	}
//
//	public Dog() {
//		super();
//	}
}
