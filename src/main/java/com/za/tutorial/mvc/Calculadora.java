package com.za.tutorial.mvc;

public class Calculadora {
	public int a;
	public int b;
	public int ssuma;
	public int rresta;
	
	public  int resta(){
		rresta = getA() - getB();
		return rresta;
	}
	
	public  int suma(){
		
		ssuma= getA() + getB();
		return ssuma;
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
