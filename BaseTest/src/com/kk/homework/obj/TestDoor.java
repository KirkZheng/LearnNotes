package com.kk.homework.obj;

public class TestDoor {
	public static void main(String[] args) {
		Door r=new SafetyDoor();
		r.setType("买了一个安全门");
		System.out.println(r.getType());
		SafetyDoor d=new SafetyDoor();
		d.type="名字叫电子狗安全门";
		System.out.println(d.type);
		r.open();
		d.lock();
		d.bell();
	}
	
}
