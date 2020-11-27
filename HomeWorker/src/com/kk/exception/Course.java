package com.kk.exception;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * 1.输入1～3之间任一个数字，程序将输出相应的课程名称如:
 * Map<Integer,String> maps =......  maps.put(1,"java")输入正确，
 * 输出对应课程名称。如果输入错误，给出错误提示,不管输入是否正确，均输出“欢迎提出建议”语句
 * @author kz96
 *
 */
public class Course {
	public static void main(String[] args) {
		Map<Integer,String> maps=new HashMap<Integer,String>();
		maps.put(1,"语文");
		maps.put(2,"数学");
		maps.put(3,"英语");
		Scanner input=new Scanner(System.in);
		try {
		System.out.println("请输入你要选择的课程：1.语文 2.数学 3.英语");
		Integer choose=input.nextInt();
		if(choose>=1&&choose<=3) {
		//添加一个增强for循环
		Set<Entry<Integer,String>>err=maps.entrySet();
		//遍历数据
		for(Entry<Integer,String>err2:err) {
			if(err2.getKey().equals(choose)) {
				System.out.println("你选择的课程是："+err2.getValue());
					}
				}
			}else {
				System.out.println("输入的范围过大！");
			}
		}catch(InputMismatchException e) {
			System.out.println("输入的不是数字！");
		}finally {
			System.out.println("欢迎光临！");
		}
			}
		}
	

			
	
