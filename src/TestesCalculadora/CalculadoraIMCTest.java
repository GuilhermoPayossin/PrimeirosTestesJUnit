package TestesCalculadora;

import static org.junit.Assert.*;

import org.junit.Test;

import FontesCalculadora.CalculadoraIMC;

public class CalculadoraIMCTest {
	
	CalculadoraIMC calc = new CalculadoraIMC();
	private double ImcEsperado;
	
	@Test
	public void testeCalculoImcPeso100Altura2m() {
		ImcEsperado = 25;
		double ImcCalculado = calc.calculaIMC(100, 2);
		
		assertEquals(ImcEsperado, ImcCalculado, 0);
	}

}
