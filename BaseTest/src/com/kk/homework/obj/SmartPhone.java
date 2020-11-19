package com.kk.homework.obj;

public class SmartPhone extends Phone implements SmartInterface{
	//创建智能手机类继父类手机类
	public void photos() {
		System.out.println("拍照");
	}
	public void musicplay() {
		System.out.println("放音乐");
	}
	public void goonline() {
		System.out.println("上网");
	}
	public void facerecognition() {
		System.out.println("人脸识别");
	}
	
	
}
