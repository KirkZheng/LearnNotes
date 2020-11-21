package com.kk.base;

/*
 * 方法的简单运用
 */


public class Demo13 {
	public static void main(String[] args) {
		System.out.println("\n"+"\n"+"---------------加减乘除运算----------"+"\n"+"\n");
		jia(100,200);
		jian(200,100);
		chen(10,10);
		chu(20,2);
	}
	public static void jia(int num1,int num2) {
		int num3=num1+num2;
		System.out.println("\t"+"\t"+num3);
	}
	public static void jian(int num1,int num2) {
		int num3=num1-num2;
		System.out.println("\t"+"\t"+num3);
	}
	public static void chen(double num1,double num2) {
		double num3=num1*num2;
		System.out.println("\t"+"\t"+num3);
	}
	public static void chu(double num1,double num2) {
		double num3=num1/num2;
		System.out.println("\t"+"\t"+num3);
	}
	
}
