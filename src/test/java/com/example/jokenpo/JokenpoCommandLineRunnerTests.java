package com.example.jokenpo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JokenpoCommandLineRunnerTests {

	JokenpoCommandLineRunner commandLineRunner = new JokenpoCommandLineRunner();

	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeEach
	public void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@Test
	public void pedraPapelTest() throws Exception {
		commandLineRunner.run("pedra", "papel");
		assertEquals(JokenpoOptions.PAPEL.win(), outputStreamCaptor.toString().trim());
	}

	@Test
	public void pedraTesouraTest() throws Exception {
		commandLineRunner.run("pedra", "tesoura");
		assertEquals(JokenpoOptions.PEDRA.win(), outputStreamCaptor.toString().trim());
	}

	@Test
	public void pedraPedraTest() throws Exception {
		commandLineRunner.run("pedra", "pedra");
		assertEquals(JokenpoOptions.PEDRA.draw(), outputStreamCaptor.toString().trim());
	}
}