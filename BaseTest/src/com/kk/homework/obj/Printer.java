package com.kk.homework.obj;

public class Printer {
	
	private InkBox inkBox;
	
	public void print() {
		String box = inkBox.getColor();
		System.out.println("现在使用"+box+"墨盒打印");
	}
	
	
	public InkBox getInkBox() {
		return inkBox;
	}

	public void setInkBox(InkBox inkBox) {
		this.inkBox = inkBox;
	}
	
	
}
