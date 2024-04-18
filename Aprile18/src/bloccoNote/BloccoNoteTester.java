package bloccoNote;

import java.util.Scanner;

public class BloccoNoteTester {
	
	public static void main(String[] args) {
		Scanner s=new Scanner();
		
		//creo un blocco note
		BloccoNote blocco=new BloccoNote();
		System.out.println("Benvenuto nel tuo blocco note: "+blocco.nome);
		
		//chiedo tutto in input
		System.out.println("Aggiungi una nuova nota:");
		System.out.println("Titolo:");
		String titolo=s.nextLine();
		System.out.println("Descrizione:");
		String descrizione=s.nextLine();
		System.out.println("Posizione:");
		int posizione=s.nextInt();
		
		//aggiungo una nota
		blocco.addNota(titolo,descrizione,posizione);
		//stampo la nota
		blocco.stampaBloccoNote();
		
		
	}
	
}
