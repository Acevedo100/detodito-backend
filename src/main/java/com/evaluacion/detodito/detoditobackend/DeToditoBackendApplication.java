package com.evaluacion.detodito.detoditobackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeToditoBackendApplication {

	public static void main(String[] args) {
		String[] beanDefinitionNames =  SpringApplication.run(DeToditoBackendApplication.class, args).getBeanDefinitionNames();
	}

}
