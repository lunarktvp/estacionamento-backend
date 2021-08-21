package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@ComponentScan(basePackages = "com.example.Controladores")
//@EntityScan(basePackages="com.example.modelos")
//@EnableJpaRepositories(basePackages = "com.example.repositorios")
public class EstacionamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstacionamentoApplication.class, args);
	}

}
