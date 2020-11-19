package com.kk.test.obj;

public class TestAnimal {
	//定义一个主类的测试类

		public static void main(String[] args) {
			//创建animal实例
			//向上转型（封箱）
			Animal a = new Dog();
			//狗类继承动物类，输出动物类的方法
			a.eat();
			a.sleep();
			//向下转型(拆箱)输出狗类的方法
			Dog d=(Dog)a;
			d.run();		
		}

	}
