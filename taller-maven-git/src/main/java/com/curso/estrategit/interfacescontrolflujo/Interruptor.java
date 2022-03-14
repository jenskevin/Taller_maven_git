package com.curso.estrategit.interfacescontrolflujo;

public class Interruptor implements InterfaceEjecutable {
	
	public static final String APAGAR = "Apagar";
	public static final String ENCENDER = "Encender";

	public String ejecutar(String comando) {
		// TODO Auto-generated method stub
		return "Comando: " + comando + ", ejecutando";
	}
	
	
	public void encender(){
		prensentarResultadoComando(ENCENDER);
	}


	private void prensentarResultadoComando(String comando) {
		String resultado =  ejecutar(comando);
		System.out.println(resultado);
	}
	
	public void apagar() {
		prensentarResultadoComando(APAGAR);
	}
	

}
