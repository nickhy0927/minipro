package com.iss.minipro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.iss")
@MapperScan("com.iss.core.platform.user.dao")
public class MiniProApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniProApplication.class, args);
	}
}
