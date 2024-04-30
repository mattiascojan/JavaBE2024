package controller;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Canzone;

public class CanzoniCtrl {
	
	public ArrayList<Canzone> canzoni;
	

	public CanzoniCtrl() {
		this.canzoni=new ArrayList<Canzone>();
	}
	
	//costruisco un metodo per caricare le canzoni manualmente
	public void caricaCanzoniAMano() {
		String raccolta[]= {
				"Starway To Heaven;Led Zeppelin",
				"Una vita spericolata;Vasco Rossi",
				"Stai zitto;Salmo",
				"Paradise City;Guns and Roses",
				"King of Blue;Miles Davis",
				"Acido;Prozac+",
				"Servi della gleba;EELST",
				"Cornutone;Squallor",
				"Bocca di rosa;De Andre'",
				"Gelato al cioccolato;Pupo"
		};
		
		for (String song : raccolta) { //split rimuove anche il carattere V
			String separate[] = song.split(";"); //divide le canzoni sopra quando trova il ";"
			String titolo = separate[0];  // se metto "" nello split, separa ogni lettera
			String cantante = separate[1];
			Canzone canzone=new Canzone(titolo, cantante);
			this.canzoni.add(canzone);
		}
	}
	
	public void caricaCanzoniDaFile() {
		File file=new File("./canzoni.csv");
		try {
			Scanner s=new Scanner(file);
			while(s.hasNextLine()) {
				String riga=s.nextLine();
				String rigaSpezzata[]=riga.split(",");
				String cantante=rigaSpezzata[0];
				String titolo=rigaSpezzata[1];
				Canzone song=new Canzone(titolo,cantante);
				this.canzoni.add(song);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}