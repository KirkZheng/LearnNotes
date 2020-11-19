package com.kk.homework.obj;

public abstract class Door {
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void open() {
		System.out.println("开门");
	}
}
