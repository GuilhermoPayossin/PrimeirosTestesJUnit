package TestesCalculadora;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import FontesCalculadora.CalculadoraAritmetica;

public class CalculadoraAritmeticaTest {

	//Atributos
	int resultadoEsperado;
	int resultadoReal;
	
	//Métodos de teste
	@Test
	@DisplayName("Teste de soma entre 2 e 5")
	public void testeSomar2Com5() {
		resultadoEsperado = 7;
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		resultadoReal = calc.soma(2, 5);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	@DisplayName("Teste de soma entre 3 e 9")
	public void testeSomar3Com9() {
		resultadoEsperado = 12;
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		resultadoReal = calc.soma(3, 9);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	@DisplayName("Teste de subtração entre 6 e 7")
	public void testeSubtrair6De7() {
		resultadoEsperado = -1;
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		resultadoReal = calc.subtrair(6, 7);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	@DisplayName("Teste de subtração entre 10 e 7")
	public void testeSubtrair10De7() {
		resultadoEsperado = 3;
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		resultadoReal = calc.subtrair(10, 7);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	@DisplayName("Teste de multiplicação entre 2 e 6")
	public void testeMultiplicar2Com6() {
		resultadoEsperado = 12;
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		resultadoReal = calc.multiplicar(2, 6);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	@DisplayName("Teste de multiplicação entre 3 e 10")
	public void testeMultiplicar3Com10() {
		resultadoEsperado = 30;
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		resultadoReal = calc.multiplicar(3, 10);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	@DisplayName("Teste de divisão entre 15 e 3")
	public void testeDividir15Com3() {
		resultadoEsperado = 3;
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		resultadoReal = calc.dividir(15, 3);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	@DisplayName("Teste de divisão entre 15 e 0")
	public void testeDividir15Com0() {
		ArithmeticException resultadoEsperado = new ArithmeticException();
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		resultadoReal = calc.dividir(15, 0);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
}
