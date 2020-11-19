package com.kk.test;

public class People implements Flyable,Composition {
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	public void eat() {
		System.out.println("吃");
	}
	public void sleep() {
		System.out.println("睡");
	}
	public void Attributes() {
		System.out.println("人类由男人女人组成");
	}
}
