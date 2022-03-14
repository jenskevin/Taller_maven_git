package com.estrategit.curso.herenciapolimorfismo;

import javax.swing.JOptionPane;

public class CalculadorFigura {
	
	public static void calcularAreaFigura(Figura figura) {
		//System.out.println("El Area es:" + figura.getArea());
		JOptionPane.showMessageDialog(null,"El Area de la figura (" + figura.nombre + ") es: " +  figura.getArea() );
	}

}
