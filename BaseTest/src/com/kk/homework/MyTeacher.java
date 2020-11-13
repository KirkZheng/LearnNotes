package com.kk.homework;

public class MyTeacher {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		//创建教师对象，并实例化属性
		Teacher tec=new Teacher();
		tec.name="大黄";
		tec.age=22;
		tec.workyear=3.5;
		System.out.println(tec.name+"同学"+"今年"+tec.age+"岁"+"工作了"+tec.workyear+"年");
		//教师对象里面实例化学生对象
		Student stu=new Student();
		stu.name="大牛";
		stu.age=25;
		stu.type="学生";
		tec.hi(stu.name);
	}

}
