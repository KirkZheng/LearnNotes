package com.kk.base;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.println("请输入你的金钱：");
		int money= sc.nextInt();
		if(money>=5){
			System.out.println("可以吃包子！");
		}else if(money>=4) {
			System.out.println("可以吃馒头！");
		}else {
			System.out.println("喝白开水！");
		}
	}
}