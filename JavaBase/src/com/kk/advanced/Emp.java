package com.kk.advanced;
import java.util.Scanner;


/*
 * 
 * 1、编写emp类，属性：name、age、sex、
 * account、pwd，编写注册验证方法，
 * account及pwd不能小于6位，
 * 用户名不能有特殊符号（@、#、$、%）
 * 
 */

public class Emp{
	public static void main(String[] args) {
		while(true) {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入你的用户名：");
		
		String username=s.next();
		System.out.println("请输入你的密码：");
		String password=s.next();
		String[] blackList= {"@","#","$","%"};
		if(username.length()<6) {
			System.out.println("用户名长度不能小于6");
		}else if(password.length()<6){
			System.out.println("密码长度不能小于6位");
		}else {
			for(int i=0;i<blackList.length;i++) {
				if(username.contains(blackList[i])) {
					System.out.println("用户名不能包含特殊符号！");
				}
				}
			System.out.println("登陆成功！");
			break;
			}
		}
	}
}