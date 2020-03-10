package com.diego.restClase.cine;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GeneradorCine {
	@Autowired
	private Sala sala1;
	
	@Autowired
	private Sala sala2;
	
	public List<Sala> listaSalas1 = new ArrayList<Sala>();
	public List<Sala> listaSalas2 = new ArrayList<Sala>();

	@Bean
	public Cine cine1() {
		
		Cine cine1 = new Cine();
		cine1.setId(10);
		cine1.setCIF("1111");
		cine1.setNombre("Yelmo");
		/*Tengo que conseguir alamacenar mas de una sala en
		 * el set, probablemente con una lista*/
		listaSalas1.add(sala1);
		listaSalas1.add(sala2);
		cine1.setSalas(listaSalas1);
		return cine1;
		
	}
	
	@Bean
	public Cine cine2() {
		
		Cine cine2 = new Cine();
		cine2.setId(20);
		cine2.setCIF("2222");
		cine2.setNombre("Cinesa");
		listaSalas2.add(sala1);
		cine2.setSalas(listaSalas2);
		
		return cine2;
	}
	
	
}
