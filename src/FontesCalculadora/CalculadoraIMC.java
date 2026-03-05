package FontesCalculadora;

public class CalculadoraIMC {
	public double calculaIMC (double peso, double altura) {
		
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		double alturaAoQuadrado = calc.multiplicar(altura, altura);
		
		return calc.dividir(peso, alturaAoQuadrado);
	}

}
