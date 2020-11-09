package com.kk.test;

/*
 * 循环100次，循环到50结束方法
 * 
 */
public class Demo14 {
	public static void main(String[] args) {
		print();
	}
	public static void print() {
		for(int i=1; i<=100; i++) {
			if(i==50) {
				System.out.println("结束方法！！");
				break;
			}
			System.out.println("第"+i+"次");
		}
		
	}
}
