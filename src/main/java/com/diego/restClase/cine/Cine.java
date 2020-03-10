package com.diego.restClase.cine;

import java.util.List;

public class Cine {
	private int id;
	
	private String nombre;
	
	private String CIF;
	
	private List<Sala> salas; /*= new ArrayList<Sala>*/
	
	


	
	/*GETTERS & SETTERS*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCIF() {
		return CIF;
	}

	public void setCIF(String cIF) {
		CIF = cIF;
	}

	public List<Sala> getSalas() {
		return salas;
	}

	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}

	
	/*To String*/


	@Override
	public String toString() {
		return "\n\nCine{ "
				+ "\n\t[id=" + id + ","
				+ "\n\tnombre=" + nombre + ", "
				+ "\n\tCIF=" + CIF + ", "
				+ "\n\tsalas=" + salas 
				+ "]}";
	} 
	
	
	
}
