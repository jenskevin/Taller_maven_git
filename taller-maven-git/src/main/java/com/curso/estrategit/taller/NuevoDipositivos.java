package com.curso.estrategit.taller;



public class NuevoDipositivos extends Accion{
	
	public void atenuar () {
		String resultado = ejecutar("NUEVO DISPOSITIVOS");
		System.out.println(resultado);
	}

}
