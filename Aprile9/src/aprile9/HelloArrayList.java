package aprile9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class HelloArrayList {

	public static void main(String[] args) {
		ArrayList<String> animali=new ArrayList<String>();
		animali.add("Cane");
		animali.add("Gatto");
		animali.add("Canarino");
		animali.add("Squalo");
		
		//per poter richiamare un elemento uso il metodo .get(indice)
		System.out.println(animali.get(0));
		System.out.println(animali.get(2));
		
		//per rimuovere un elemento .remove()
		animali.remove(2);
		//il valore in casella 3 finisce nella 2
		
		//per conoscre la misura dell'array list uso .size()
		System.out.println("Il mio array è composto da: "+animali.size()+" elementi.");
	
		for(String animale:animali) {
			System.out.println(animale);
		} //for each, printa tutti
		
/////////////////////////////////////////////////////////////////////		
		
		//FACCIO UN ARRAY LIST DI NUMERI
		ArrayList<Integer> voti=new ArrayList<>();
		//nel <x> secondo non sono obbligato a inserire Integer, va bene vuoto
		voti.add(10);
		voti.add(5);
		voti.add(12);
		voti.add(1);
		
		for(Integer voto:voti) {
			System.out.println(voto);
		}
		
//////////////////////////////////////////////////////////////////////
		
		//Per creare un array list, posso fare riferimento al tipo list
		//si trova piu' in alto nella gerarchia
		
		List<String> parole=new ArrayList<>();
		parole.add("Ciao");
		parole.add("Come");
		parole.add("Stai");
		
		for(String parola:parole) {
			System.out.println(parola);
		}

////////////////////////////////////////////////////////////////////////		
		List<String> nomi=new ArrayList<>(Arrays.asList("Dario", "Luisa", "Pasquale", "Gennaro", "Anna", "Luca"));
		
		for(String nome:nomi) {
			System.out.println(nome);
		}
//////////////////////////////////////////////////////////////////////
		
		//Voglio creare un array partendo da un arrayList
		List<String> colori=new ArrayList<>();
		colori.add("Rosso");
		colori.add("Giallo");
		colori.add("Blu");
		colori.add("Verde");
		colori.add("Rosa");
		colori.add("Bianco");
		colori.add("Nero");
		
		String[] coloriPR=new String[colori.size()];
		for(int i=0;i<colori.size();i++) {
			coloriPR[i]=colori.get(i);
		} // uso il ciclo for per scorrere l'array PR
		
		for(String colorePR:coloriPR) {
			System.out.println(colorePR);
		}
		colori.remove(1); //cambiano colori anche coloriPR e lascia un null alla fine
		//SFASAMENTO FRA SIZE E IL NUMERO DI CARATTERI
		
		Collections.reverse(colori);
		System.out.println("Stampo i colori al contrario");
		for(String colore:colori) {
			System.out.println(colore);
		}//riordina al contrario i valori
		
		Collections.shuffle(colori);
		//randomizza i valori dentro
		
		Collections.sort(colori);
		for(String colore:colori) {
			System.out.println(colore);
		}//ordine alfabetico
		
		Collections.sort(colori, Collections.reverseOrder());
		//ordina al contrario dell'alfabetico
		
		
		
		
		
		
		
		
	}

}
