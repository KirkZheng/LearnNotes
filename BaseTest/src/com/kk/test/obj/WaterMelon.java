package com.kk.test.obj;

public class WaterMelon extends Plant {
	//土豆的攻击方式
	public void attck() {
		System.out.println("天降正义！");
	}
	public WaterMelon() {
		//土豆消耗阳光值
		super.setSunLinght(300);
	}
}
