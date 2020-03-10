package com.diego.restClase.cine;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GeneradorSala {

	@Bean
	public Sala sala1() {
		Sala sala1 = new Sala();
		sala1.setNuemero(10);
		sala1.setCapacidad(100);
				
		return sala1;
	}
	
	@Bean
	public Sala sala2() {
		Sala sala2 = new Sala();
		sala2.setNuemero(20);
		sala2.setCapacidad(200);
				
		return sala2;
	}
}
