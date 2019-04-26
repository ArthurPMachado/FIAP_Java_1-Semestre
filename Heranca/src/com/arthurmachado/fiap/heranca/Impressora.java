package com.arthurmachado.fiap.heranca;

public abstract class Impressora {

	protected String marca;
	protected int tensao;
	
	public Impressora(String marca, int tensao) {
		this.marca = marca;
		this.tensao = tensao;
	}
	
	public void imprimir() {
		System.out.println("Imprimindo...");
	}
	
	public void setMarca() {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setTensao() {
		this.tensao = tensao;
	}
	
	public int getTensao() {
		return tensao;
	}
}
