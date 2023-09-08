package com.diegojacober.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;


@SpringBootApplication
@Configuration
@OpenAPIDefinition(info = @Info(title = "API Curso", version = "1.0",
        description = "Api desenvolvida em curso",
        contact = @Contact(name = "Diego Alencar Jacober")),
        security = {@SecurityRequirement(name = "bearerToken")}
)
public class CursoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoApplication.class, args);
	}
}
