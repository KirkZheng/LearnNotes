package com.kk.base;

public class Case7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//九九乘法表
		for(int i=1; i<=9; i++ ) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}
}
