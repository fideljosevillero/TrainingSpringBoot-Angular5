package com.fidel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fidel.controller.jwtController;

@SpringBootApplication
public class TrainingSpringBootAngular5Application {

	public static void main(String[] args) {
		SpringApplication.run(TrainingSpringBootAngular5Application.class, args);
		jwtController jwt = new jwtController();
		String jwtData = jwt.getJwt();
		// recupera el valor del token
		jwt.parseJWT(jwtData);
	}
}
