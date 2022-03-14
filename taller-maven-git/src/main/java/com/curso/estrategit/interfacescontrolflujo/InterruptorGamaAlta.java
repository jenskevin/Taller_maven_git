package com.curso.estrategit.interfacescontrolflujo;

public class InterruptorGamaAlta extends Interruptor {
	
	public void atenuar () {
		String resultado = ejecutar("ATENUAR");
		System.out.println(resultado);
	}

}
