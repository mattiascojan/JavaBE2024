package eccezioni;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File f = new File("./test.txt");
		f.exists(); //controllo se esiste, anche se non esiste
		try {
			FileReader fr=new FileReader(f);
			//ci da problema: perche' non puo' leggere il nulla
			//se messo da solo fuori
			//CONTINUA A NON TROVARE NESSUN FILE
		} catch (FileNotFoundException e) {
			System.out.println("File non trovato");
//			e.printStackTrace();//FileInputStream (elimino la riga e la eccezione è risolta	
		}
////////////////////////////////////////////////////////////////////////////		
		stampaTesto("Ciao");//ci da Ciao...
		stampaTesto(null);//ci da eccezione con 1:
		stampaTesto2("Ciao");//ci da Ciao...
		stampaTesto2(null);//2:GESTITO CON TRY CATCH	
//		stampaTesto2(4);//ERRORE NON GESTIBILE
/////////////////////////////////////////////////////////		
		try {
			stampaTesto3(null);
		} catch (MieEccezioni e) {
			e.getMessage();
		}
		
		esegui(null);
/////////////////////////////////////////////////////
		System.out.println("Errore IndexOutOfBound");
		int[] arraynumeri= {4,3,2,4};
		try {
			System.out.println(arraynumeri[7]);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Errore, casella troppo altra");
		}
		System.out.println("Errore divido per zero");
		Scanner sc=new Scanner(System.in);
		System.out.println("Dammi i due numeri");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Divisione dei due numeri: "+a/b);
		
	}
	
///////////////////////////////////////////////////////////	
	private static void stampaTesto(String testo) {
//		String tmp=testo.concat("...");//aggiunge ... alla fine
//		System.out.println(tmp);
		if(testo!=null) {
			String tmp=testo.concat("...");
			System.out.println(tmp);
		}else {//gestisco l'eccezione
			System.out.println("Non puoi avere un testo null");
		}
	}
	private static void stampaTesto2(String testo) {
		try {//facciamo l'if sopra con tryCatch
			String tmp=testo.concat("...");
			System.out.println(tmp);
			
			int val=10;
			if(testo!=null&&testo.length()<val) {
				System.out.println("Il tuo testo ha mene di "+val+" caratteri.");
			}
		}catch (IndexOutOfBoundsException e) {
			System.out.println("Siamo nella IndexOutOfBound");
		}catch(NullPointerException e) {
			System.out.println("Siamo nella nullPointer");
//		}finally {//viene eseguito sempre al termine dei due sopra
//			System.out.println("Sto eseguendo il finally");
		}
	}
/////////////////////////////////////////////////////////
	
	//con throws vado a domandare la gestione dell'eccezione al metodo
	//che la eseguira', di quel metodo saro' obbligato ad usare tryCatch
	public static void stampaTesto3(String testo) throws MieEccezioni{
		if(testo==null) {
			throw new MieEccezioni();
		}else {
			System.out.println(testo);
		}
	}
	
	public static void esegui(String testo) {
		try {
			stampaTesto3(testo);
		} catch (MieEccezioni e) {
			System.out.println(e.getMessage());
		}
	}
////////////////////////////////////////////////////
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}