package com.curso.estrategit.interfacescontrolflujo;



public class PruebaInterface {
	
	public static void main(String[] args) {
		Interruptor interruptor = new Interruptor();
		interruptor.apagar();
		interruptor.encender();
		InterruptorGamaAlta interruptorGamaAlta = new 
				InterruptorGamaAlta();
		interruptorGamaAlta.encender();
		interruptorGamaAlta.atenuar();
		interruptorGamaAlta.apagar();
	}

}
