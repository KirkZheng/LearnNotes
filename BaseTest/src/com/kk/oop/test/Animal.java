package com.kk.oop.test;

/**
 * 动物类
 * @author cos
 * 	关键字:abstract 抽象
 *	抽象类:
 *		1.抽象类无法实例化,但是可以作为数据类型接受其子类的实例,可以应用多态
 *		2.抽象类是无法实例化,但是可以有构造方法,使用构造方法可以进行初始化动作(给属性赋值)
 *	应用:
 *		1.抽象类,一般作为父类使用,用以提供公有的属性和方法
 *		2.如果有个类是不想被实例化的类,也会作为抽象类
 *		3.预计该类将会有抽象方法,也会先行设置为抽象类
 *
 *	抽象方法:
 *		1.抽象方法没有方法体,没有{代码块},子类必须实现父类的抽象方法,
 *			除非子类也是抽象类,那么子类的子类就必须实现(重写)所有的抽象方法(父类及以上的父类).
 *		2.抽象方法只能定义在抽象类中,但是抽象类不一定要有抽象方法
 *		3.抽象方法定义一种约束,而不实现,如:eat所有动物都有吃的方法(行为),
 *			但是具体实现不统一,所以子类根据自身的需求来实现
 *	应用:
 *		1.公有(子类共有的行为)的方法,但实现方式不一样
 */
public abstract class Animal {
	String type;
	String sex;
	int age;
	//抽象方法
	public abstract void eat();
	/*
	 * public void eat() { System.out.println("吃吃吃"); }
	 */
	public void sleep() {
		System.out.println("睡睡睡");
	}
	public Animal() {
		System.out.println("这个是抽象类,父类的无参构造方法");
	}
}
//	public Animal(String type, String sex, int age) {
//		super();
//		this.type = type;
//		this.sex = sex;
//		this.age = age;
//	}
//	
//}
//
