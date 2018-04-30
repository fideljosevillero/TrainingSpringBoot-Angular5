package com.fidel.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fidel.model.User;
import com.fidel.service.UserService;

// http://javasampleapproach.com/spring-framework/spring-boot/spring-cors-example-crossorigin-spring-boot
// https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Origin

//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials="true", allowedHeaders="Access-Control-Allow-Origin")
//@CrossOrigin(origins = "*", maxAge = 3600, allowCredentials="true", allowedHeaders="Access-Control-Allow-Origin")
//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

@RestController
@RequestMapping("/user")
public class UserController {

	Logger log = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService servicio;
	
	@RequestMapping(value = "/prueba", method = RequestMethod.GET)
	public String pruebaMethod() {
		System.out.println("INGRESA AL METODO!!!");
		servicio.save(new User(null, "fidel", "Villero", "fidel@correo.com"));
		log.info("Entra al metodo!!! " + servicio.count() );
		return "Prueba editado !!!";
	}
	
	@RequestMapping(value="/lista", method=RequestMethod.GET)
	public List<User> listUsers(){
		log.info("Va a listar los users");
		return servicio.findAll();
	}
	
	
}
