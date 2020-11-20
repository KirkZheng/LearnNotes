package com.kk.oop.phone;

public class TestPhone {
	public static void main(String[] args) {
		
		System.out.println("手机功能");
		Phone p=new SmartPhone();
		p.call();
		p.message();
		
		System.out.println("----------------");
		
		SmartPhone sp=(SmartPhone)p;
		System.out.println("智能手机特有功能:");
		sp.photos();
		sp.musicplay();
		sp.goonline();
		sp.facerecognition();
		
		System.out.println("----------------");
		
		CommonPhone cp=new CommonPhone();
		System.out.println("普通手机特有功能：");
		cp.musicplay();
		cp.goonline();
	}
}
