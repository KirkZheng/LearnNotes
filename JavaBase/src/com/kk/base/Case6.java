package com.kk.base;

import java.util.Scanner;

public class Case6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0;
		for(int i=1; i<=5; i++) {
			System.out.println("请输入你的成绩：");
			int sorce=sc.nextInt();
			if(sorce>=80) {
				count++;	
			}	
		}
		System.out.println(count*1.0 / 5*100+"%");
	}

}
