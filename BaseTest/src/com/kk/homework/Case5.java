package com.kk.homework;

import java.util.Scanner;

public class Case5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(int i=1; i<10; i++) {
			System.out.println("请输入你的成绩：");
			int sorce=sc.nextInt();
			if(sorce<0 || sorce>100) {
				System.out.println("输入错误！");
				continue;
				}	
		}
	}

}
