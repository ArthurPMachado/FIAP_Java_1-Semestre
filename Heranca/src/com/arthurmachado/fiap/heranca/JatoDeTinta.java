package com.arthurmachado.fiap.heranca;

public class JatoDeTinta extends Impressora{

	private boolean cheio = true;
	private int qtdeCartuchos;
	
	public JatoDeTinta(String marca, int tensao, int qtdeCartuchos) {
		super(marca, tensao);
		this.qtdeCartuchos = qtdeCartuchos;
	}
	
	@Override
	public void imprimir() {
		System.out.println("Imprimindo como Jato de Tinta...");
	}
	
	@Override
	public String toString() {
		return "A marca da impressora eh " + this.marca + ". Ela possui " +
				this.qtdeCartuchos + " cartuchos. Sua tensao eh de " + this.tensao + "v.";
	}
	
	public void setQtdeCartuchos(int qtdeCartuchos) {
		this.qtdeCartuchos = qtdeCartuchos;
	}
	
	public int getQtdeCartuchos() {
		return qtdeCartuchos;
	}
}
