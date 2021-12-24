package com.yash.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;



@ImportResource("classpath:applicationContext.xml")
@PropertySource("classpath:db.properties")
@SpringBootApplication(scanBasePackages = "com.yash.*")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
