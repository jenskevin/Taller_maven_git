package com.estrategit.curso;

/*
 * @Autor: JENS WONG
 * @AÑO: 2022
 * @DESCRIPCION: CLASE DE PRUEBAS TALLER
 */

public class Persona extends Object{
	
	private static Integer contadorPersona;

	private String nombrePersona;
	private String cedula;

	static {
		contadorPersona = 0;
	}

	public Persona(String nombre, String cedula) {
		nombrePersona = nombre;
		this.cedula = cedula;
		contadorPersona++;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String convertirCadena() {
		return nombrePersona + " " + cedula;
	}

	public static Integer getContadorPersona() {
		return contadorPersona;
	}

	public static String concatenarNombres(String nombre1, String nombre2) {
		return nombre1 + " " + nombre2;
	}
	


@Override
public String toString() {
	return "Persona [Nombre_Persona=" + nombrePersona + ", Cedula=" + cedula + "]";
}


  
  
}
