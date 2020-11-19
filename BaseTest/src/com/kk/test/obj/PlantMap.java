package com.kk.test.obj;

import com.kk.homework.obj.Bean;

public class PlantMap {
	//初始阳光值
	private int sun=1000;
	public Plant addPlant(int chose) {
		Plant p=null;
		if(chose==1) {
			p=new Bean();
		}else if(chose==2){
			p=new Potato();
		}else if(chose==3){
			p=new WaterMelon();
		}else {
			System.out.println("输入错误！");
			return null;
		}if(p.getSunLinght()<=this.sun) {
		this.sun-=p.getSunLinght();
		System.out.println("消耗了"+p.getSunLinght()+"阳光值，还剩"+this.sun+"阳光值");
			return p;
	}else {
		return null;
	}
	}
	public void setSun(int sun) {
		this.sun=sun;
	}
	public int getSun() {
		return this.sun;
	}
}