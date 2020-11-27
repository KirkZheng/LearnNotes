package com.kk.exception;

public class People {
	private double tall;

	public double getTall() {
		return tall;
	}

	public void setTall(double tall) throws TallException {
		if(tall<0.00) {
			throw new TallException("身高不能是负数");
		}
	}
	public People(double tall) {
		super();
		this.tall = tall;
	}

	public People() {
		super();
	}
	
}
