package esercizioDado;

import java.util.ArrayList;
import java.util.Scanner;

public class DadoTester {
	
	private static void calcolaRisultato(int lancio6, int lancio12, int lancio20) {
		System.out.println("Hai eseguito i seguenti lanci: "+lancio6+" "+lancio12+" "+lancio20);
		
		ArrayList<Integer> lanci=new ArrayList<>();
		lanci.add(lancio6);
		lanci.add(lancio12);
		lanci.add(lancio20);
		int risultato=0;
		int somma=lancio6+lancio12+lancio20;
		
		if(somma>26) {
			risultato +=10; //risultato=risultato+10
		}
		for(Integer lancioSingolo:lanci) {
			if(lancioSingolo%2==0) {
				risultato+=6;
			}
		}
		
		System.out.println("Hai totalizzato "+risultato+" punti.");
	}
	
	
	private static void superLucky(int lancio6, int lancio12, int lancio20) {
		System.out.println("Hai eseguito i seguenti lanci: "+lancio6+" "+lancio12+" "+lancio20);
		if(lancio6==lancio12&&lancio6==lancio20) {
			System.out.println("Hai vinto, con 100 punti pure.");
		}else {
			System.out.println("Hai perso.");
		}
	}
	private static void truccato(int lancio6, int lancio12, int lancio20) {
		System.out.println("Hai eseguito i seguenti lanci: "+lancio6+" "+lancio12+" "+lancio20);
		if(lancio6==lancio12&&lancio6==lancio20) {
			System.out.println("Hai vinto, con 100 punti pure.");
		}else {
			System.out.println("Hai perso.");
		}		
	}

	public static void main(String[] args) { //static: appartiene solo a DadoTester
		
		//costruisco il set di dadi
		Dado dado6= new Dado(6);
		Dado dado12= new Dado(12);
		Dado dado20= new Dado(20);
		
//		int lancio6=dado6.lancia();
//		int lancio12=dado12.lancia();
//		int lancio20=dado20.lancia();
//		System.out.println(lancio6+" "+lancio12+" "+lancio20);
		
		//GIOCO	
		System.out.println("Gioco dei tre dadi:");
		
		boolean condizioneUscita=true;
		while(condizioneUscita) { //ciclo del gioco
			
			System.out.println("Inserisci un comando: L per lanciare normale; S per superlucky; 0 per chiudere");
			Scanner sc=new Scanner(System.in);
			String comando=sc.nextLine();
			
			switch(comando) {
				case "L":
					int lancio6=dado6.lancia();
					int lancio12=dado12.lancia();
					int lancio20=dado20.lancia();
					calcolaRisultato(lancio6,lancio12,lancio20);
					break;
				case "S":
					lancio6=dado6.lancia();
					lancio12=dado12.lancia();
					lancio20=dado20.lancia();
					superLucky(lancio6,lancio12,lancio20);
					break;
				case "ladro":
					lancio6=dado6.truccaDado();
					lancio12=dado12.truccaDado();
					lancio20=dado20.truccaDado();
					truccato(lancio6,lancio12,lancio20);
					break;
				case "0":
					System.out.println("Hai chiuso il gioco");
					condizioneUscita=false;
					break;
				default: //se sbagli ad inserire
					System.out.println("Non capisco il comando");
					break;
			};
			
			
			
		}
		
		
	}


	

	

	
	
}
