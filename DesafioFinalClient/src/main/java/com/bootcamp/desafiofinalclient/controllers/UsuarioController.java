package com.bootcamp.desafiofinalclient.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.bootcamp.desafiofinal.starters.Usuarios;

public class UsuarioController {

	@Autowired
	private Usuarios usu;
	
	
	@GetMapping("/listar")
	public ResponseEntity<String> verUsuario() {
		
		return new ResponseEntity<String>(HttpStatus.OK).ok(usu.verUsuario());
	}
	
}
