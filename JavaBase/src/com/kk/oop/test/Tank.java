package com.kk.oop.test;

public class Tank extends Weapon{
	//创建子类坦克类并继承父类
	//创建坦克的特有属性护甲并私有化
	private String armor;
//创建坦克的攻击方法
	public void attack() {
		System.out.println("上膛放炮");
	} 
	//独有方法
		/**
		 * 碾压
		 */
		public void nianya() {
			System.out.println("使用"+armor+"装甲");
		}
	public void setArmor(String armor) {
		this.armor=armor;
	}
	public String getArmor(String armor) {
		return this.armor;
	}
	public Tank() {
	}
	public Tank(String armor) {
		this.armor=armor;
	}
}