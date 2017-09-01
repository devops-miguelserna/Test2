package com.za.tutorial.calculadora;

public class Calculadora {
	public int a;
	public int b;
	public int ssuma;
	public int rresta;
	
	public  int getResta(){
		rresta = getA() - getB();
		return rresta;
	}
	
	public  int getSuma(){
		
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
