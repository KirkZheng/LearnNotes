package com.kk.test.obj;

public class Plane extends Weapon {
	//创建子类飞机并定义特有属性速度
	private int speed;
	//创建飞机的攻击方法
	public void attack() {
		System.out.println("机枪扫射");
	}
	//独有的方法
	public void fly() {
		System.out.println(speed+"马赫"+"定速巡航");
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	//创建子类飞机的构造方法
	public Plane() {
		
	}
	public Plane(int speed) {
		this.speed=speed;
	}
	
}
