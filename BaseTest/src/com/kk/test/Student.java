package com.kk.test;

public class Student {

		// 属性
		String name;
		String sex;
		/**
		 * 显式写了无参构造方法,里面进行属性/数据的默认值的初始化
		 */
		//构造方法,会帮我们 创建对象,构造方法不需要去调用,也调用不了,jvm会自动调用
		//new Student() 1.在堆里面开辟一个内存空间 2.class属性的初始化(默认值) 3.执行构造方法 4把内存地址复制给对象名
		public Student(String stuName, String stuSex) {
			name = stuName;
			sex = stuSex;
		}

		public void hi() {
//			String name;
			System.out.println("大家好,我是" + name + ",我是" + sex + "孩");
		}

}
