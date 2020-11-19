package com.kk.test;

public class Dog extends Animal implements Play,Runnable,Swimmable{
	
	public void play() {
		System.out.println("大嘴叼飞碟");
	}
	public void runnable() {
		//调用运动
		System.out.println("小短腿四处跑");
	}
	public void swimmable() {
		//调用游泳功能
		System.out.println("狗爬式划水");
	}
}
