package com.arthurmachado.fiap.heranca;

public class Laser extends Impressora{

	public Laser(String marca, int tensao) {
		super(marca, tensao);
	}
	
	public void imprimir() {
		System.out.println("Imprimindo como laser...");
	}
}
