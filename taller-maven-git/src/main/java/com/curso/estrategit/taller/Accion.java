package com.curso.estrategit.taller;

public class Accion implements IControl{
	
	public static final String ENCENDER = "ENCENDER";
	public static final String APAGAR = "APAGAR";
	public static final String SUBIR_VOLUMEN = "SUBIR_VOLUMEN";
	public static final String BAJAR_VOLUMEN = "BAJAR_VOLUMEN";
    public static final String PAUSA = "PAUSA";

    
    
	public void encender() {
		presentarResultadoComando(ENCENDER);
	}

	public void apagar() {
		presentarResultadoComando(APAGAR);
	}
	
	public void subirvolumen() {
		presentarResultadoComando(SUBIR_VOLUMEN);
	}
	
	
	public void bajarvolumen() {
		presentarResultadoComando(BAJAR_VOLUMEN);
	}
	
	public void pausa() {
		presentarResultadoComando(PAUSA);
	}
	
	
	private void presentarResultadoComando(String comando) {
		String resultado = ejecutar(comando);
		System.out.println(resultado);
	}

	public String ejecutar(String comando) {
		// TODO Auto-generated method stub
		return "Comando: " + comando + ", ejecutando";
	}

}
