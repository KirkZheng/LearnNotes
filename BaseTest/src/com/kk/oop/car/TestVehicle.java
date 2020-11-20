package com.kk.oop.car;

public class TestVehicle extends Vehicle {
	public static void main(String[] args) {
		/*
		 * 3、创建车car 特有属性：type品牌,单车Bicycle 
		 * 特有属性：color颜色 ，巴士bus 特有属性seatNum座位数 ,
		 * 交通工具类Vehicle 共有属性 price价格，speed速度，子类继承父类，运行子类测试父类方法，
		 * 
		 */
		Bus bs=new Bus();
		bs.price=30;
		bs.seatNum=24;
		System.out.println("公交车"+bs.price+"万"+"能坐"+bs.seatNum+"人");
		bs.driver();
		
		Bicycle by=new Bicycle();
		by.price=2;
		by.color="黄色";
		System.out.println("单车"+by.price+"万"+by.color);
		by.driver();
		
		Car ca=new Car();
		ca.type="宝马";
		ca.price=56;
		System.out.println(ca.type+ca.price+"万");
		ca.driver();
		
	}
}
