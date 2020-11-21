package com.kk.oop.animal;
import java.util.Scanner;

public class TestPet {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你想要领取的宠物：（狗/猫）");
		String name = input.next();
		System.out.println("请输入品种");
		String type = input.next();
		System.out.println("请输入性别");
		String sex = input.next();
		System.out.println("请输入亲密度");
		int intimacy = input.nextInt();
		if(name.equals("狗") ||name.equals("猫")) {
			Pet p = new Pet();
			p.setSex(sex);
			p.setIntimacy(intimacy);
			p.show(name,type);
		}else {
			System.out.println("输入错误，请重新输入");
		}
		
	}
}

