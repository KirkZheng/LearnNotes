package com.kk.oop.test;

public class Bean extends Plant{
	//创建子类豌豆并集成父类植物
	public void attck() {
		//设置豌豆的攻击方式
		System.out.println("吐豆子攻击。。。。。");
	}
	public Bean() {
		//豌豆消耗100点阳光值
		super.setSunLinght(100);
	}
}
