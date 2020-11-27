package com.kk.exception;
import java.util.*;

public class Demo {
	public static void main(String[] args) {
		int a[] = new int[2];
		try {
			int b=10/0;
		}catch(ArithmeticException e1) {
			System.out.println("算数运算异常");
		}try {
			System.out.println(a[3]);
		//判断可能出现的异常
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("数据溢出！");
		}finally{
			a[0]=6;
			System.out.println("重新赋值"+a[0]);
		}
	}
	
}