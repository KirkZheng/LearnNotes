package com.kk.test;
import java.util.Scanner;


public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			String chose="";
			do {
				System.out.println("-------------欢迎使用学生管理系统------------");
				System.out.println("---------------请选择你的操作------------");
				System.out.println("1.增加成绩 2.删除成绩 3.修改成绩 4.查询成绩  5.退出系统");
				chose=sc.next();
			}while(!chose.equals("5"));
			System.out.println("退出系统！");
	}

}
