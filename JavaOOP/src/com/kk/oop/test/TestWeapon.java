package com.kk.oop.test;

import java.util.Scanner;

public class TestWeapon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Zone wz = new Zone();
		System.out.println("你有"+wz.getMoney()+"万可以挥霍");
		System.out.println();

		while (true) {
			System.out.println("请选择你要购买的武器\n1.坦克（100万） 2.飞机（300万）");
			int chose = input.nextInt();
			// 接受购买回来的武器
			Weapon w = wz.buyWeapon(chose);
			if (w != null) {
				//调用武器的特有的方法
				if (w instanceof Tank) {//判断w的对象是否为tank的类型
					Tank t =(Tank) w;
					t.nianya();//调用子类特有的方法
				}else if(w instanceof Plane) {
					Plane p = (Plane) w;
					p.fly();//调用子类特有的方法
				}
				//调用武器的攻击
				System.out.print("攻击方式：");
				w.attack();
				System.out.println();
				System.out.println("你还有"+wz.getMoney()+"万");
				System.out.println();
			} else if (wz.getMoney() >= 100) {// 还有钱,可以榨取
					System.out.println("试试其他选择...");
			} else {
				System.out.println("钱不够！！！");
				break;
			}
		}

	}

}
