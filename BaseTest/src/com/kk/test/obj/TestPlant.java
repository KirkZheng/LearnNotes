package com.kk.test.obj;

import java.util.Scanner;

public class TestPlant {
	// 主方法，用来输出
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PlantMap pm = new PlantMap();
		while (true) {
			System.out.println("输入你想购买的植物：\n1.豌豆\n2.土豆\n3.西瓜");
			int chose = input.nextInt();
			Plant p = pm.addPlant(chose);
			if (p != null) {
				p.attck();
			} else if (pm.getSun() >= 25) {
				System.out.println("试试其他选择...");
				continue;
			} else {
				System.out.println("阳光值不足！！！");
				break;
			}
		}
	}
}
