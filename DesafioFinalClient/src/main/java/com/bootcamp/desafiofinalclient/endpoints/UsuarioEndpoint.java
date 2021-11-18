package com.bootcamp.desafiofinalclient.endpoints;

import java.util.*;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import com.bootcamp.desafiofinal.starters.Usuarios;

@Component
@Endpoint(id = "usuario")
public class UsuarioEndpoint {
	
	List<Usuarios>usu=new ArrayList<>();
	
	@ReadOperation
	public List<Usuarios> ReadOperation()
	{
		return usu;
	}
	
	@WriteOperation
	public void WriteOperation(@Selector Usuarios u)
	{
		usu.add(u);
	}
	
}
