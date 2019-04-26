package com.arthurmachado.fiap.editortexto;

import com.arthurmachado.fiap.heranca.Cera;
import com.arthurmachado.fiap.heranca.Impressora;
import com.arthurmachado.fiap.heranca.JatoDeTinta;
import com.arthurmachado.fiap.heranca.Laser;
import com.arthurmachado.fiap.heranca.Matricial;

public class Word {
	
	public static void main(String[] args) {
		
		Impressora[] impressoras = new Impressora[4];
		impressoras[0] = new JatoDeTinta("HP", 110, 4);
		impressoras[1] = new Matricial("Brother", 220);
		impressoras[2] = new Laser("Epson", 220);
		impressoras[3] = new Cera("Canon", 110);
		
		for(int i = 0; i<impressoras.length; i++) {
			impressoras[i].imprimir();
			System.out.println(impressoras[i].toString());
		}
	}
}
