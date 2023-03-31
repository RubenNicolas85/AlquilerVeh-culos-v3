package org.iesalandalus.programacion.alquilervehiculos.controlador;

import java.time.LocalDate;
import java.util.List;
import org.iesalandalus.programacion.alquilervehiculos.modelo.Modelo;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Alquiler;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Cliente;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Vehiculo;
import org.iesalandalus.programacion.alquilervehiculos.vista.*;

public class Controlador {
	
	private Modelo modelo; 
	private Vista vista; 
	
	public Controlador(Modelo modelo, Vista vista) {
		
		if (modelo == null) {
			throw new IllegalArgumentException("ERROR: El modelo no puede ser nulo.");
		}
		if (vista == null) {
			throw new IllegalArgumentException("ERROR: La vista no puede ser nula.");
		}
		
		this.modelo = modelo;
		this.vista = vista;
		this.vista.setControlador(this);
	}
	
	/** El método comenzar del controlador, se encarga de invocar al método comenzar del 
	 * modelo y de la vista, primero del modelo para crear toda la lógica del programa y
	 * después la vista para poder interactuar con el usuario (nos pedirá los datos por teclado 
	 * y mostrará los resultados por pantalla) */
	
	public void comenzar() throws Exception {
		
		modelo.comenzar();
		vista.comenzar();
	}
	
	public void terminar() {
		
		modelo.terminar();
	}
	
	public void insertar(Cliente cliente) throws Exception{
		
		modelo.insertar(cliente);
	}
	
	public void insertar(Vehiculo vehiculo) throws Exception {
		
		modelo.insertar(vehiculo);
	}
	
	public void insertar(Alquiler alquiler) throws Exception {
		
		modelo.insertar(alquiler);
	}
	
	public Cliente buscar(Cliente cliente) {
		
		return modelo.buscar(cliente); 
	}
	
	public Vehiculo buscar(Vehiculo vehiculo) {
		
		return modelo.buscar(vehiculo); 
	}
	
	public Alquiler buscar(Alquiler alquiler) {
		
		return modelo.buscar(alquiler); 
	}
	
	public void modificar(Cliente cliente, String nombre, String telefono) throws Exception {
		
		modelo.modificar(cliente, nombre, telefono);
	}
	
	public void devolver(Cliente cliente, LocalDate fechaDevolucion) throws Exception{
		
		modelo.devolver(cliente, fechaDevolucion);
	}
	
	public void devolver(Vehiculo vehiculo, LocalDate fechaDevolucion) throws Exception{
		
		modelo.devolver(vehiculo, fechaDevolucion);
	}
	
	public void borrar(Cliente cliente) throws Exception {
		
		modelo.borrar(cliente);
	}
	
	public void borrar(Vehiculo vehiculo) throws Exception{
		
		modelo.borrar(vehiculo);
	}
	
	public void borrar(Alquiler alquiler) throws Exception{
	
		modelo.borrar(alquiler);
	}
	
	public List<Cliente> getClientes() {
		
		return modelo.getListaClientes();
	}
	
	public List<Vehiculo> getVehiculos() {
		
		return modelo.getListaVehiculos(); 
	}
	
	public List<Alquiler> getAlquileres() {
		
		return modelo.getListaAlquileres(); 
	}	
	
	public List<Alquiler> getAlquileres(Cliente cliente) {
		
		return modelo.getListaAlquileres(cliente); 
	}

	public List<Alquiler> getAlquileres(Vehiculo vehiculo) {
	
		return modelo.getListaAlquileres(vehiculo); 
	}
}
