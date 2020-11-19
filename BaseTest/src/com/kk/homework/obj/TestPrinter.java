package com.kk.homework.obj;

public class TestPrinter {

	public static void main(String[] args) {
		Printer p = new Printer();
		//买墨盒
		ColorInk ci = new ColorInk();
		BlackInk bi = new BlackInk();
		
		p.setInkBox(ci);
		p.print();
		System.out.println("更换墨盒测试");
		p.setInkBox(bi);
		p.print();
	}

}