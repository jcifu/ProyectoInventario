package com.example.proyectoInventario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages="com.example.proyectoInventario")
@EnableJpaRepositories(basePackages="com.example.proyectoInventario.dao")
@EntityScan(basePackages="com.example.proyectoInventario.domain")
public class ProyectoInventarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoInventarioApplication.class, args);
	}

}
