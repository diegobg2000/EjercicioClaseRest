package com.diego.restClase.cine;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RutasCine {
	
	@Autowired
	private Cine cine1;
	
	@Autowired
	private Cine cine2;
	
	List<Cine> listaCines = new ArrayList<Cine>();

	public List<Cine> retornarClientes(){
	listaCines.add(cine1);
	listaCines.add(cine2);
	return listaCines;
	
	
	}
	


	@GetMapping("/cines")
	public ResponseEntity<List<Cine>> mostarCines(){
		

		
		return new ResponseEntity<List<Cine>>(retornarClientes(), HttpStatus.I_AM_A_TEAPOT);

	}
	
	@GetMapping("/cine/{id}")
		public ResponseEntity<Cine> buscarPorId(@PathVariable int id) {
			retornarClientes();
			Cine encontrado = null;
		
			for(int i =0; i<listaCines.size(); i++) {
				
				if(listaCines.get(i).getId() == id) {
				 
					encontrado = listaCines.get(i);
				}
			}
			return new ResponseEntity<Cine>(encontrado, HttpStatus.I_AM_A_TEAPOT);
	}
	
	@PostMapping("/addCine")
	public void addCine(@RequestBody Cine cine) {
			
		System.out.println(cine);
	}
	
	@PutMapping("/addCine/{id}")
	public void addCinePut(@RequestBody Cine cine, @PathVariable int id) {
		
//		/*Me aseguro de guardar el ID
//		 * Me aseguro de que seteo el id para que no me inserte un id que no existe
//		 * y en vez de actualizar me cree uno nuevo, que no es lo que estoy buscando*/
//		cine.setId(id);
//		cineDAO.save(cine);
		
	
			
		System.out.println(cine);
		
		System.out.println("Este es el id: " + id);
		
		System.out.println("*****************************************");
	}
	
	@DeleteMapping("/borrarCine/{id}")
	public void deleteCine(@RequestBody Cine cine, @PathVariable int id) {
		
		System.out.println("El id: " + id + " ha sido borrado");
		System.out.println("******************************************");
		
	}
}



