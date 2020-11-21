package com.kk.base;

public class TestDog {
	public static void main(String[] args) {
		Animal a=new Dog();
		a.setAge(5);
		a.setType("大黄");
		System.out.println("小狗"+a.getType()+a.getAge()+"岁");
		//多态，父类无法使用子类
		Dog d=(Dog)a;
		d.play();
		d.runnable();
		d.swimmable();
	}
}
