package com.estrategit.curso.herenciapolimorfismo;

public class Rectangulo extends Figura {
	
	
	protected Double altura;
	protected Double base;



	public Rectangulo(Double altura, Double base) {
		this.altura = altura;
		this.base = base;
		nombre = "Rectangulo";
		
	}
	
	public Double getArea() {
		return base * altura;
	}
	
	
	

}
