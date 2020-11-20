package com.kk.test;
import java.util.Scanner;
/*
 * 
 * @kirkzheng2020.11.05
 * 
 */

public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 从家里上学，
		 *  1、moeny>=100,做车， moeny>=1000曹操专车,moeny<1000滴滴拼车
		 *  2、moeny<走路
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入你的金额：");
		int money=sc.nextInt();	
		if(money>=100) {
			if(money>1000) {
			System.out.println("曹操专车");
				}if(money<1000){
					System.out.println("滴滴拼车");
			}
		}else {
			System.out.println("走路");
		}	
	}
}
