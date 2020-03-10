package com.diego.restClase.cine;

public class Sala {
	private int nuemero;
	
	private int capacidad;


	
	/*GETTERS & SETTERS*/
	public int getNuemero() {
		return nuemero;
	}

	public void setNuemero(int nuemero) {
		this.nuemero = nuemero;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "\n\nSala{ "
				+ "\n\t[nuemero=" + nuemero + ","
				+ "\n\tcapacidad=" + capacidad 
				+ "]}";
	}
	
	


}
