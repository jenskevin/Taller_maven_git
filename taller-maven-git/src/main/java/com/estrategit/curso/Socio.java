package com.estrategit.curso;

public class Socio extends Persona{
	
	private String codigoSocio;

	public Socio(String nombre, String cedula) {
		super(nombre, cedula);
		// TODO Auto-generated constructor stub
	}

	public Socio(String nombre, String cedula, String codigoSocio) {
		super(nombre, cedula);
		this.codigoSocio = codigoSocio;
	}

	
	

}
