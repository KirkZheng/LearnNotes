package com.kk.base;
import java.lang.reflect.Array;

public class Demo15 {

	public static void main(String[] args) {
		int[] array = {12, 3, 34, 53};
		System.out.println("遍历所有数组");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "   ");
		}
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println();
		System.out.println("所有元素之和是" + sum);
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				}
			}
		System.out.println("最大值是：" + max);
		}
	}

