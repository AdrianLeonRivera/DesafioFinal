package com.bootcamp.desafiofinal.starters;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Usuarios.class)
@EnableConfigurationProperties(UsuariosProperties.class)
public class UsuariosAutoconfigure {
	
	private UsuariosProperties properties;

	public UsuariosAutoconfigure(UsuariosProperties properties) {
		this.properties = properties;
	}
	
	@Bean
	public Usuarios getUsuario()
	{
		System.out.println("Usuario: "+properties.getNombre());
		return new Usuarios(properties.getNombre(), properties.getApellidos(), properties.getEmail(), properties.getPass());
	}
	
	
}
