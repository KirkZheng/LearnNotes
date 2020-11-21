package com.kk.oop.test;

public class Potato extends Plant {
		//土豆的攻击方式
	public void attck() {
		System.out.println("炸你一身屎！");
	}
	public Potato() {
		//土豆消耗阳光值
		super.setSunLinght(25);
	}
}
