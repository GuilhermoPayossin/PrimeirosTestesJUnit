package TestesCalculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import FontesCalculadora.CalculadoraAritmetica;

public class CalculadoraAritmeticaTest {

	//Atributos
	CalculadoraAritmetica calc = new CalculadoraAritmetica();
	private double resultadoEsperado;
	private double resultadoReal;
	private static int numTeste = 0;
	private String nomeTeste = "";
	
	@Before
	public void contarTeste() {
		numTeste++;
		System.out.println("==========================================");
		System.out.println("Teste número " + numTeste + " iniciando...");
	}
	
	@After
	public void contabilizarTeste() {
		System.out.println("Teste " + nomeTeste + " finalizado");
		System.out.println(" - Resultado: " + resultadoReal);
	}
	
	//Métodos de teste
//	@DisplayName("Teste de soma entre 2 e 5")
	public void testeSomar2Com5() {
		nomeTeste = "Somar 5 com 5";
		resultadoEsperado = 7;
		resultadoReal = calc.soma(2, 5);
		
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}
	
	@Test
//	@DisplayName("Teste de soma entre 3 e 9")
	public void testeSomar3Com9() {
		nomeTeste = "Somar 3 com 9";
		resultadoEsperado = 12;
		resultadoReal = calc.soma(3, 9);
		
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}
	
	@Test
//	@DisplayName("Teste de subtração entre 6 e 7")
	public void testeSubtrair6De7() {
		nomeTeste = "Substrairr 6 de 7";
		resultadoEsperado = -1;
		resultadoReal = calc.subtrair(6, 7);
		
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}
	
	@Test
//	@DisplayName("Teste de subtração entre 10 e 7")
	public void testeSubtrair10De7() {
		nomeTeste = "Subtrair 10 de 7";
		resultadoEsperado = 3;
		resultadoReal = calc.subtrair(10, 7);
		
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}
	
	@Test
//	@DisplayName("Teste de multiplicação entre 2 e 6")
	public void testeMultiplicar2Por6() {
		nomeTeste = "Multiplicar 2 por 6";
		resultadoEsperado = 12;
		resultadoReal = calc.multiplicar(2, 6);
		
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}
	
//	@DisplayName("Teste de multiplicação entre 3 e 10")
	public void testeMultiplicar3Por10() {
		nomeTeste = "Multiplicar 3 por 10";
		resultadoEsperado = 30;
		resultadoReal = calc.multiplicar(3, 10);
		
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}
	
	@Test
//	@DisplayName("Teste de divisão entre 15 e 3")
	public void testeDividir15Por3() {
		nomeTeste = "Dividir 15 por 3";
		resultadoEsperado = 7.5;
		resultadoReal = calc.dividir(15, 2);
		
		//Quando double, ultimo parametro significa até qual casa decimal ele deve comparar
		//Quinta casa decimal: 0.00001
		assertEquals(resultadoEsperado, resultadoReal, 0.1);
	}
}

                                                                                                                                                                                                                                                              