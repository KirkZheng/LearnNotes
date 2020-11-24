package com.kk.advanced;

import java.util.Scanner;


//将手机号码中间的四位数换成*号
public class Phone {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(true) {
		System.out.println("请输入你的电话号码：");
		String phone=s.next();
		
		if(phone.length()<11) {
			System.out.println("请输入11位电话号码");
		}else if(phone.length()>11){
			System.out.println("请输入11位电话号码");
		}else {
			String phoneNum=phone.substring(0,3)+"****"+phone.substring(7,phone.length());
			System.out.println("号码加密后为"+phoneNum);
			break;
			}
		
		}
	}	
}
