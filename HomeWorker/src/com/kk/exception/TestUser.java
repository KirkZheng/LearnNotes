package com.kk.exception;

import java.util.Scanner;

public class TestUser {
	public static void main(String[] args) {
		UserServices us=new UserServicesImpl();
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("请选择你要进行的操作：");
			System.out.println("1.注册2.登录3.退出");
			int chose=s.nextInt();
			if(chose==1) {
				System.out.println("请输入你的账户：");
				String account=s.next();
				System.out.println("请输入你的密码：");
				String password=s.next();
				System.out.println("请再次输入你的密码：");
				String rePassword=s.next();
				us.register(account, password, rePassword);
			}else if(chose==2) {
				System.out.println("请输入你的账户：");
				String account=s.next();
				System.out.println("请输入你的密码：");
				String password=s.next();
				us.login(account, password);
			}else {
				System.out.println("退出系统");
			}	
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
}
