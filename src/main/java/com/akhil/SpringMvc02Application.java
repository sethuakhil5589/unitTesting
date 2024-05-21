package com.akhil;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMvc02Application {

	public static void main(String[] args) {
		SpringApplication app=new SpringApplication();
		app.setBannerMode(Mode.CONSOLE);
		app.run(SpringMvc02Application.class, args);
	}

}
