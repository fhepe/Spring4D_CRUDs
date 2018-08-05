package br.edu.unoescsmo.bootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BootWebApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BootWebApplication.class, args);
	}
}
