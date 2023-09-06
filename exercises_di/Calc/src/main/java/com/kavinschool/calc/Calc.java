package com.kavinschool.calc;

public class Calc {
	private double x, y;
	private String compName;
	private String ssnNumber;
	private String address;

	Calc(double a, double b) {
		x = a;
		y = b;
	}

	public double add() {
		return x + y;
	}

	public double mul() {
		return x * y;
	}

	public double sub() {
		return x - y;
	}

	public double div() {
		return x / y;
	}

	public double rem() {
		return x % y;
	}

	public double cube() {
		return x * x * x;
	}

	public double square() {
		return x * x ;
	}

	public double pow() {
		return Math.pow(x,y);
	}
	
	public double square4() {
		return square() * square() ;
	}

}
