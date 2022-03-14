package com.estrategit.curso.herenciapolimorfismo;

public class Lanzador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangulo rectangulo = new Rectangulo(20.5,10.5);
		
		
		CalculadorFigura.calcularAreaFigura(rectangulo);
		
		Circulo circulo = new Circulo(10.5);
		CalculadorFigura.calcularAreaFigura(circulo);
		
		
		Cuadrado cuadrado = new Cuadrado(5.5);
		CalculadorFigura.calcularAreaFigura(cuadrado);
		
		
		Triangulo triangulo = new Triangulo(2.5,4.5);
		CalculadorFigura.calcularAreaFigura(triangulo);
	}

}
