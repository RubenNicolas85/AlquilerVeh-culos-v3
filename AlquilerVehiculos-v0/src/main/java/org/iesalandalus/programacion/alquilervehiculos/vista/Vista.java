package org.iesalandalus.programacion.alquilervehiculos.vista;

import org.iesalandalus.programacion.alquilervehiculos.controlador.Controlador;

public abstract class Vista {

	protected Controlador controlador; 
	
	public void setControlador(Controlador controlador) {
		
		if(!(controlador==null)) {
			
			this.controlador=controlador; 
		}
	}
	
	public abstract void comenzar() throws Exception; 
	
	public abstract void terminar(); 
}
