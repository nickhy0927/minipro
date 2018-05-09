package com.iss.minipro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan(basePackages = "com.iss")
public class MiniProApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniProApplication.class, args);
	}
}
