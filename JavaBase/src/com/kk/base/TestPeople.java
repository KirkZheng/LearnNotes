package com.kk.base;

public class TestPeople {
	public static void main(String[] args) {
		People p=new People();
		p.setName("小红");
		p.setAge(19);
		System.out.println(p.getName()+p.getAge());
		p.eat();
		p.sleep();
		p.Attributes();
	}
}
