package com.kk.test;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 3.从屏幕输入10个数，在输入错误的情况下，给出相应的提示，并继续输入。
 * 在输入完成的情况下，找到最大最小数。(20分)
 * 几种常见的运行时异常
 *ArrayIndexOutOfBoundsException数组越界异常
 *InputMismatchException输入字符非数字异常
 */
public class Test3 {
	public static void main(String[] args) {
		while(true) {
		try {
		int[] arr = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
        	
            System.out.println("请输入第" + (i + 1) + "个数字:");
            int number = input.nextInt();
            arr[i] = number;
        }
        int sum = 0, min = arr[0], max = min;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("所有数之和是"+sum);
        System.out.println("最大值：" + max+"最小值：" + min);
        break;
    
		}catch(InputMismatchException e) {
			System.out.println("非法字符！");
			}
		}
		}
	}

