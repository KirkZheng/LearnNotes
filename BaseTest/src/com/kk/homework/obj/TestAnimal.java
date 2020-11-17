package com.kk.homework.obj;

public class TestAnimal {

	
		//3、重写dog、cat、bird、snake继承动物类后的，吃方法,运行并测试
	
	public static void main(String[] args) {
		
		System.out.println("父类的方法是");
		Animal a=new Animal();
		a.eat();
		System.out.println();
		
		System.out.println("继承父类的年龄属性");
		System.out.println();
		
		Dog d=new Dog();
		d.name="流浪狗";
		d.age=5;
		System.out.println(d.name+d.age+"岁");
		System.out.println("重载后子类的方法是");
		d.eat();
		System.out.println();
		
		Cat c=new Cat();
		c.name="咬人猫";
		c.age=3;
		System.out.println(c.name+c.age+"岁");
		System.out.println("重载后子类的方法是");
		c.eat();
		System.out.println();
		
		
		Brid b=new Brid();
		b.name="爆炸鸟";
		b.age=6;
		System.out.println(b.name+b.age+"岁");
		System.out.println("重载后子类的方法是");
		b.eat();
		System.out.println();
		
		Snake s=new Snake();
		s.name="贪吃蛇";
		s.age=3;
		System.out.println(s.name+s.age+"岁");
		System.out.println("重载后子类的方法是");
		s.eat();
		
	}

}
