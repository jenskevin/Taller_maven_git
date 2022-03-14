package com.estrategit.curso.herenciapolimorfismo;

public class Circulo extends Figura{
	
	
	public static final Double PI;
	
	private Double radio;
	
	
	static {
		PI = 3.1416;
	}
	
	

	public Circulo(Double radio) {
		this.radio = radio;
		nombre = "Circulo";
	}

	@Override
	public Double getArea() {
		// TODO Auto-generated method stub
		return PI * radio * radio;
	}
	
	

}
