package com.example.jokenpo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JokenpoCommandLineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		JokenpoOptions firstPlayer = JokenpoOptions.valueOf(args[0].toUpperCase());
		JokenpoOptions secondPlayer = JokenpoOptions.valueOf(args[1].toUpperCase());
		System.out.println(firstPlayer.compareRival(secondPlayer));
	}

}
