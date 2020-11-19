package com.kk.test.obj;

public class Manager extends Employee {
	//调用抽象方法
	public void work() {
		System.out.println(super.getName()+"编号是"+super.getNum());
	}
	public Manager() {
		super();
	}
	public Manager(int Num,String name) {
		super(Num,name);
	}
}
