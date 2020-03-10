package com.diego.restClase.reloj;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/*Esta ruta va a ser un controlador, pero como estoy con Rest la anotacion sera @RestController*/
@RestController
public class RutasReloj {
	/*Cuando alguien me pida esta ruta yo voy a devolver un reloj*/
	@GetMapping("/unReloj")
	public Reloj unReloj() {
		
		Reloj reloj = new Reloj();
		reloj.setNombre("Buenos aires");
		reloj.setHora(12);
		reloj.setMinutos(33);
		reloj.setSegundos(55);
		
		return reloj;
	}
	
	
	@GetMapping("/relojes")
	public List<Reloj> listaRelojes(){
	
	List<Reloj> relojes = new ArrayList<Reloj>();
	Reloj reloj1 = new Reloj();
	reloj1.setNombre("Buenos aires");
	reloj1.setHora(12);
	reloj1.setMinutos(33);
	reloj1.setSegundos(55);
	
	Reloj reloj2 = new Reloj();
	reloj2.setNombre("China");
	reloj2.setHora(12);
	reloj2.setMinutos(33);
	reloj2.setSegundos(55);
	
	relojes.add(reloj1);
	relojes.add(reloj2);
	
	return relojes;
	}
	
	/*Lo que quiero aqui es que el Framework se encargue de darme el objeto reloj*/
	@PostMapping("/addReloj")
	/*Le digo que como estoy utilizando Json en el cuerpo de la request voy a enviar un reloj*/
	public void addReloj(@RequestBody Reloj reloj) {
		System.out.println("Ha llegado el reloj de " + reloj);
		
	}
	

}
