package org.iesalandalus.programacion.alquilervehiculos;

import org.iesalandalus.programacion.alquilervehiculos.controlador.Controlador;
import org.iesalandalus.programacion.alquilervehiculos.modelo.FactoriaFuenteDatos;
import org.iesalandalus.programacion.alquilervehiculos.modelo.Modelo;
import org.iesalandalus.programacion.alquilervehiculos.modelo.ModeloCascada;
import org.iesalandalus.programacion.alquilervehiculos.vista.Vista;
import org.iesalandalus.programacion.alquilervehiculos.vista.texto.VistaTexto;

public class MainApp {
	
	/** En el método main se hace uso del patrón factoría abstracta para crear nuestro Modelo - 
	 * Vista - Controlador (MVC). En nuestro caso, se ha modificado el constructor del modelo,
	 * ahora hay que pasarle un parámetro de tipo FactoriaFuenteDatos, que puede ser memoria o
	 * ficheros. Simplemente cambiando este dato del enumerado, FICHEROS ó MEMORIA usaremos la 
	 * lógica del programa de la parte del negocio-ficheros o negocio-memoria. El resto sigue
	 * igual que en las anteriores versiones, la vista la construimos con un objeto tipo vista
	 * texto. Una vez tenemos construido nuestro controlador, iniciamos la ejecución del programa
	 * con el método comenzar del controlador */
	
	public static void main(String[] args) {

		@SuppressWarnings("unused")
		boolean error = false;

		try {

			error = false;

			FactoriaFuenteDatos fuenteDatos = FactoriaFuenteDatos.FICHEROS; 

			Vista vistaTexto = new VistaTexto();
			Modelo modeloCascada = new ModeloCascada(fuenteDatos);

			Controlador controlador = new Controlador(modeloCascada, vistaTexto);
			controlador.comenzar();

		} catch (Exception e) {

			System.out.println(e.getMessage());
			error = true;
		}
	}
}
