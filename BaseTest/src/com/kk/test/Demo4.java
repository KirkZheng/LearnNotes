package com.kk.test;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while循环求1-100所有奇数之和
		int count=1;//定义一个计数器变量
		int sum=0;//定义一个变量用来计算和的值
		while(count<101) {
			if(count%2!=0) {
				sum=sum+count;
			}
			count++;
		}
		System.out.println(sum);
		}
	}