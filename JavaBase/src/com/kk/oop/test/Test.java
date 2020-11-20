package com.kk.oop.test;


public class Test {

	public static void main(String[] args) {
		//局部内部类
		class Inner implements DemoInterface{
			@Override
			public void show() {
				System.out.println("看看啊,这个是局部内部类实现接口的方式");
			}
		}
		//接口引用指向实现类
		DemoInterface i = new Inner();
		i.show();
		System.out.println("==========================");
		//匿名内部类,使用匿名内部类一般都是该接口所实现的方法只会使用一次
		DemoInterface i2 = new DemoInterface() {
			@Override
			public void show() {
				System.out.println("看看啊,这个是匿名内部类");
			}
		};
		//调用接口方法
		i2.show();
	}
	public void m1() {
		
	}
	public void m2() {
		
	}
}
