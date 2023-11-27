package com.iny.adminserver.INY2;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.iny.adminserver")
@SpringBootApplication
public class InyAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InyAdminServerApplication.class, args);
	}

}
