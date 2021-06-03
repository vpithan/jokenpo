package com.example.jokenpo;

public enum JokenpoOptions {
	PEDRA,
	PAPEL,
	TESOURA;

	public String win() {
		return this.toString() + " Wins!";
	}

	public String draw() {
		return "We are the same option :). It's draw.";
	}

	public String compareRival(JokenpoOptions rival) {
		if (this != rival) {
			switch (this) {
				case PEDRA:
					return rival == PAPEL ?
							PAPEL.win() :
							PEDRA.win();
				case PAPEL:
					return rival == PEDRA ?
							PAPEL.win() :
							TESOURA.win();
				case TESOURA:
					return rival == PAPEL ?
							TESOURA.win() :
							PEDRA.win();
			}
		}
		return this.draw();
	}
}
