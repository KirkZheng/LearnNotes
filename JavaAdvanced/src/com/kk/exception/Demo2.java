package com.kk.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 2.输入两个数字实现两个数字相除
3.输入两个数字实现两个数字相除,异常处理try...catch
4.输入两个数字实现两个数字相除,异常处理try...catch...finally
5.输入两个数字实现两个数字相除,异常处理try...catch...finally,
		加上return 查看他们的运行顺序
 * 
 */


public class Demo2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入一个数：");
		int a=s.nextInt();
		System.out.println("请在输入一个数：");
		int b=s.nextInt();
		
		try {
			int c=(a+b)/0;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println("异常！！整数不能除0");
		}finally {
			int d=a+b;
			System.out.println("最终返回a+b="+d);
			return;
		}		
	}
		
}
