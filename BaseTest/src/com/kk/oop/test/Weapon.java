package com.kk.oop.test;

public class Weapon {
	//创建主类，武器类
	private int price;
	//定义武器的公共属性价格，并私有化
	//创建武器的基本攻击方法
	public void attack() {
		System.out.println("进行攻击");
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
}
