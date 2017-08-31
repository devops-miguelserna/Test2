package com.za.tutorial.mvc;

public class Calculadora {
	public int a;
	public int b;
	
	public int rresta;
	
	public static int suma(int a, int b){
		return a + b;
	}
	
	public static int resta(int a, int b){
		return a - b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	public void doSomething() {
		setA(getA());
		setB(getB());
	}

}
