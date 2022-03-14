package com.curso.estrategit.taller;



public class DipositivosElectronicos {

	public static void main(String[] args) {
		
		Accion interruptor = new Accion();
		interruptor.apagar();
		interruptor.encender();
		interruptor.bajarvolumen();
		interruptor.subirvolumen();
		interruptor.pausa();
		
		System.out.println("\n");
		
		NuevoDipositivos dipositivos = new NuevoDipositivos();
		dipositivos.apagar();
		dipositivos.encender();
		dipositivos.atenuar();		

	}

}
