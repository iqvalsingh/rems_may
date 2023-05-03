package com.mytangibleproperty.rems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mytangibleproperty.rems")
public class RemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RemsApplication.class, args);
	}

}
