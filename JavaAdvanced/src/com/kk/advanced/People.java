package com.kk.advanced;

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
		System.out.println("喜欢吃");
	}
	public void sleep() {
		System.out.println("喜欢睡");
	}
	public void Attributes() {
		System.out.println("人类由男人女人组成");
	}
}