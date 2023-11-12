package com.iny.adminserver.INY2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
public class InyAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InyAdminServerApplication.class, args);
	}

}
