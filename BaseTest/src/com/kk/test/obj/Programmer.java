package com.kk.test.obj;

public class Programmer extends Employee {
	//继承父类雇员类的属性
	//创建子类程序员的特有方法
	public void work() {
		System.out.println("子类方法给属性赋值"+super.getName()+"编号是"+super.getNum());
	}
	//调用抽象方法
	public Programmer() {
		super();
	}
	public Programmer(int Num,String name) {
		super(Num,name);
	}
}
