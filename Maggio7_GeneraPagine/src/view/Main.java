package view;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import model.Prodotto;
import util.LeggiScriviFile;

public class Main {
	public static void main(String[] args) {
		
		Prodotto p=new Prodotto();
		p.setId(10214);
		p.setCodice("ABC123");
		p.setMarca("Pippus");
		p.setPrezzo(2850);
		
		File destinazione=new File("./paginaWeb.html");
		
		LeggiScriviFile.scrivi(destinazione, p.generaHTML());
		
		File destinazioneJSON=new File("./objectJSON.json");
		LeggiScriviFile.scrivi(destinazioneJSON, p.generaJson());
		
		
		int risp=0;
		Scanner s=new Scanner(System.in);
		do {
			System.out.println("vuoi creare una nota? 0 no 1 si");
			risp=s.nextInt();
			s.nextLine();
		}while(risp!=0&&risp!=1);
		for(int i=1;i>-1;i++) {
			if(risp==1) {
				System.out.println("dimmi il testo");
				String testo=s.nextLine();
				File nota=new File("./nota"+i+".txt");
				LeggiScriviFile.scrivi(nota, p.generaTXT(testo));
			}
			System.out.println("altra nota? 0 per uscire");
			int risp2=s.nextInt();
			s.nextLine();
			if(risp2==0) {
				i=-2;
			}
		}
		
		
	}
}
