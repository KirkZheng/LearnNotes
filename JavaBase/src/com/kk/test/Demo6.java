package com.kk.test;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------九九乘法表的使用-------------"+"\n");
		for(int i=1; i<=9; i++ ) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}

}
