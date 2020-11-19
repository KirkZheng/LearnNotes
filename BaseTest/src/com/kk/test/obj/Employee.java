package com.kk.test.obj;

//创建抽象类志愿表
public abstract class Employee {
	//私有编号属性
	private int Num;
	private String name;
	//抽象方法
	public abstract void work();
	public void eat() {
		System.out.println("父类 的方法是吃饭！！！" );
	}
	public int getNum() {
		return Num;
	}
	public void setNum(int num) {
		Num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int Num,String name) {
		super();
		this.Num=Num;
		this.name=name;
	}
	public Employee() {
		super();
	}
	
	
}
