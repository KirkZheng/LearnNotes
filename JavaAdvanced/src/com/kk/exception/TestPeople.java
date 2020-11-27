package com.kk.exception;

public class TestPeople {
	public static void main(String[] args) {
		People p=new People();
		try{
			p.setTall(-15);
		}catch(TallException e){
			e.printStackTrace();
		}
	}
}
