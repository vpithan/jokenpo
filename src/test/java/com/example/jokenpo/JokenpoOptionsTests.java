package com.example.jokenpo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class JokenpoOptionsTests {

	@Test
	void pedraTest() {
		JokenpoOptions pedra = JokenpoOptions.PEDRA;
		
		assertEquals(pedra.compareRival(JokenpoOptions.PEDRA), pedra.draw());
		assertNotEquals(pedra.compareRival(JokenpoOptions.PAPEL), pedra.win());
		assertEquals(pedra.compareRival(JokenpoOptions.TESOURA), pedra.win());
	}

	@Test
	void papelTest() {
		JokenpoOptions papel = JokenpoOptions.PAPEL;
		
		assertEquals(papel.compareRival(JokenpoOptions.PAPEL), papel.draw());
		assertNotEquals(papel.compareRival(JokenpoOptions.TESOURA), papel.win());
		assertEquals(papel.compareRival(JokenpoOptions.PEDRA), papel.win());
	}

	@Test
	void tesouraTest() {
		JokenpoOptions tesoura = JokenpoOptions.TESOURA;
		
		assertEquals(tesoura.compareRival(JokenpoOptions.TESOURA), tesoura.draw());
		assertNotEquals(tesoura.compareRival(JokenpoOptions.PEDRA), tesoura.win());
		assertEquals(tesoura.compareRival(JokenpoOptions.PAPEL), tesoura.win());
	}
}
