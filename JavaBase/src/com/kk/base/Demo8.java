package com.kk.base;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		         //外层循环 每次打出一个*
		        for (int i = 1; i <=7; i++) {
		            //填充空格
		            for (int j = 1; j <= 7 - i; j++) {
		                System.out.print(" ");
		            }
		            //内层循环 每次打印一个*
		            for (int k = 1; k <= 20; k++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }
		}

}
