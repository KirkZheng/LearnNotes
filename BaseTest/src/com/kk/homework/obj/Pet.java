package com.kk.homework.obj;

public class Pet {
//		1、根据控制台提示信息选择领养宠物（狗/猫）输入名称、品种、亲密度（intimacy、性别，打印宠物信息，
//		注：亲密度的有效性（在1到100之间），超出范围的取默认值60，性别只能选择男孩/女孩
		
			
			//属性------>名称，品种，亲密度，性别
			String name;
			String type;
			private double intimacy;
			private String sex;					
			
			//设置亲密度的范围
			public void setIntimacy(int intimacy) {
				if(intimacy>=1&&intimacy<=100) {
					this.intimacy = intimacy;
				}
				else {
					this.intimacy = 60;
				}
			}
			public double getIntimacy() {
				
				return this.intimacy;
			}
				
			//设置性别
			
			public void setSex(String sex) {
				if(sex.equals("公")||sex.equals("母")){
					this.sex = sex;
				}else {
					this.sex = "公";
				}
			}
			public String getSex() {
				
				return this.sex;
			}
			
			public void show(String name,String type) {
				this.name = name;
				this.type = type;
				System.out.println("我的宠物是"+this.name+",它的品种是"+type+",它的性别是"+sex+",它和我的亲密度是："+intimacy);
			}
			
			
			
		

}
