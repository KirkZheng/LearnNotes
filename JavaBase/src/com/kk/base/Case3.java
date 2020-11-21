package com.kk.base;
import java.util.Scanner;

public class Case3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String chose="";
		do {
			System.out.println("---------------请选择你的操作------------");
			System.out.println("1.合格   2.重新考试");
			chose=sc.next();
		}while(chose.equals("2"));
		
		System.out.println("成绩合格，退出！");
		
	}

}
