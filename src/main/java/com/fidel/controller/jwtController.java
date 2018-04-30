package com.fidel.controller;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;
import java.security.Key;
import java.util.Date;

import javax.xml.bind.DatatypeConverter;

public class jwtController {

	Key key = MacProvider.generateKey();
	
	public String getJwt() {
		long nowMillis = System.currentTimeMillis();
//		String jwt = Jwts.builder()
//				  .setIssuedAt(new Date(nowMillis))
//				  .setSubject("user{\n"
//				  		+ "nombre: Fidel José Villero de Hoyos\\n"
//						+ "dirección: my home\n"
//				  		+ "email: fideljose17@hotmail.com\\n"
//						+ "teléfono: 3001234567\\n"
//				  		+ "}")
//				  .setIssuer("Editor de algo!!!")
//				  .signWith(SignatureAlgorithm.HS512, key)
//				  .compact();
		
		//Let's set the JWT Claims
	    JwtBuilder builder = Jwts.builder().setId("id")
	                                .setIssuedAt(new Date(nowMillis))
	                                .setSubject("subject")
	                                .setIssuer("editor!!!") 
	                                .signWith(SignatureAlgorithm.HS256, key);
		
	    long expMillis = nowMillis + 9000;
        Date exp = new Date(expMillis);
        System.out.println("--- "+ exp);
        builder.setExpiration(exp);
	    
        String jwt = builder.compact();
        
		System.out.println("code jwt " + jwt);
		return jwt;
	}
	
	public void parseJWT(String jwt) {
		 
	    //This line will throw an exception if it is not a signed JWS (as expected)
	    Claims claims = Jwts.parser()         
	       .setSigningKey(key)
	       .parseClaimsJws(jwt).getBody();
	    System.out.println("ID: " + claims.getId());
	    System.out.println("Subject: " + claims.getSubject());
	    System.out.println("Issuer: " + claims.getIssuer());
	    System.out.println("Expiration: " + claims.getExpiration());
	}
	
	
	
}
