package com.za.tutorial.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSuma(){
		int resultado = Calculadora.suma2(2, 3);
		int esperado = 5; 
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testResta() {
		int resultado = Calculadora.resta2(5, 3);
		int esperado = 2;
		assertEquals(esperado, resultado);
	}
}
