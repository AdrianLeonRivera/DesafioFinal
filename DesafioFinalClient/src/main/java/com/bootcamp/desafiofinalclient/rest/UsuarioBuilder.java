package com.bootcamp.desafiofinalclient.rest;

import com.bootcamp.desafiofinal.starters.Usuarios;

public class UsuarioBuilder {
	
	private Usuarios u=new Usuarios();
	
	public UsuarioBuilder()
	{
		
	}
	
	public  UsuarioBuilder nombre(String nombre)
	{
		this.u.setNombre(nombre);
		return this;
	}
	
	public  UsuarioBuilder apellidos(String apellidos)
	{
		this.u.setApellidos(apellidos);
		return this;
	}
	
	public  UsuarioBuilder email(String email)
	{
		this.u.setEmail(email);;
		return this;
	}
	
	public  UsuarioBuilder pass(String pass)
	{
		this.u.setPass(pass);
		return this;
	}
	
	public Usuarios build()
	{
		return u;
	}
}
