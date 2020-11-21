package com.kk.oop.door;

public class SafetyDoor extends Door implements Lock,Bell  {
	String type;
	
	public void lock() {
		System.out.println("进门上锁");
	}
	public void bell() {
		System.out.println("有人按门铃，叮咚叮咚。。。");
	}
}
