package com.kk.homework.obj;

public class CommonPhone extends Phone implements CommonInterface{
	//创建普通手机类继承父类手机类
	public void musicplay() {
		System.out.println("放音乐");
	}
	public void goonline() {
		System.out.println("上网");
	}
}
