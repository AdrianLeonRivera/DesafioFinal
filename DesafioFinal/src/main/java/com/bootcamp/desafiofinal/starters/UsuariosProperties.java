package com.bootcamp.desafiofinal.starters;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("usuario.usuario")
public class UsuariosProperties {
	
	private String nombre;
	private String apellidos;
	private String email;
	private String pass;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}
