package com.example.jokenpo;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class JokenpoApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(JokenpoApplication.class)
			.bannerMode(Banner.Mode.OFF)
			.run(args);
	}

}
