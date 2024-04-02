package b_statementFondamentali;

import java.util.Iterator;

public class forStatement {
	public static void main(String[] args) {
		
		//Il ciclo for ci permette di iterare un'operazione, un blocco di codice
		for(int i = 0; i <= 10; i++) {
			System.out.println("Giro num: " + (i));
		}
		
		//for inverso 
		for(int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		
		String[] mesi = {"Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno"};
		
//		for(int i = 0; i < mesi.length; i++) {
//			System.out.println(mesi[i]);
//		}
		
//		Foreach: da applicare su Array
		for (String nome : mesi) {
			System.out.println(nome);
		}
		
		int[] punteggiPerLvl = {25, 18, 10, 12, 5, 64, 20, 11};
		int lvlsNonSuperati = 0;
		
		for(int i = 0; i < punteggiPerLvl.length; i++) {
			System.out.println("Punteggio lvl: " + (i+1) + " - " + punteggiPerLvl[i]);
			if(punteggiPerLvl[i] < 20) {
				lvlsNonSuperati++;
				System.out.println(" Livello NON superato");
			}
		}
		
		//Se il numero di livelli non superati è maggiore della metà non ha vinto al gioco
		
		if(lvlsNonSuperati > (punteggiPerLvl.length / 2)) {
			System.out.println("Non hai vinto al gioco");
		}else {
			System.out.println("Complimenti, hai vinto al gioco");
		}
		
		
	}
}
