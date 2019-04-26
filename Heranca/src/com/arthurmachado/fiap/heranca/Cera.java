package com.arthurmachado.fiap.heranca;

public class Cera extends Impressora{

	public Cera(String marca, int tensao) {
		super(marca, tensao);
	}

	public void imprimir() {
		System.out.println("Imprimindo como Cera...");
	}
}

