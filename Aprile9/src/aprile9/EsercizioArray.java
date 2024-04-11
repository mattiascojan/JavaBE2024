package aprile9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EsercizioArray {

	public static void main(String[] args) {
	
		ArrayList<String> nomi=new ArrayList<>(Arrays.asList("Dario", "Luisa", "Pasquale", "Gennaro", "Anna", "Luca", "Fabio", "Raffaele", "Marco", "Matteo"));
		
		//riordina in ordine alfabetico l'array
		Collections.sort(nomi);
		for(int i=0;i<nomi.size();i++) {
			System.out.println(nomi.get(i)+" nella casella:"+i);
		};
		int x=0;
		for(String nome:nomi) {
			System.out.println(nome+" nella casella:"+x);
			x++;
		}
		//ci dice il numero di elementi dentro all'array
		System.out.println("Il numeri di elementi presenti nell'array è:"+nomi.size());
		
		//rimuove tutti gli elementi dell'array
		nomi.removeAll(nomi);
		
		//controllo se è veramente vuoto
		if(nomi.isEmpty()) {
			System.out.println("L'array dato è vuoto");
		}else {
			System.out.println("L'array dato non è vuoto");
		}
	}

}
