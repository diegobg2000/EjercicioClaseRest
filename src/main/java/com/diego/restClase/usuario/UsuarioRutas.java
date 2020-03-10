//package com.diego.restClase.usuario;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.diego.restClase.reloj.Reloj;
//
//@RestController
//public class UsuarioRutas {
//
//	@Autowired
//	private UsuarioDAO usuarioDAO;
//	
//	@GetMapping("/usuarios")
//	public List<Usuario> mostarUsuario() {
//		
//		List<Usuario> usuarios = (List<Usuario>)usuarioDAO.findAll();
//	
//		
//		
//		return usuarios;
//	}
//	
//	
//	@GetMapping("/usuario/{usuario}")
//	ResponseEntity<Usuario> encontrarUsuario(@PathVariable String usuario) {
//		Optional<Usuario> user = usuarioDAO.findById(usuario);
//
//		if(user.isPresent()) {
//			/*Lo que te pedia estaba en la BD pues dilo y muestralao*/
//			return new ResponseEntity<Usuario>(user.get(), HttpStatus.OK);
//			
//			
//		}
//		
//		/*Si no es asi muestra un error de http*/
//		else return new ResponseEntity<Usuario>(HttpStatus.NOT_FOUND);
//		
//	}
//	
//
//	
//	
//	
//	
//}
