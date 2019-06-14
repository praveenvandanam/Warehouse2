package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.nt.config.AppConfig;

@SpringBootApplication
@Import(AppConfig.class)
public class SpringWithAngularCurdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWithAngularCurdApplication.class, args);
	}

}
