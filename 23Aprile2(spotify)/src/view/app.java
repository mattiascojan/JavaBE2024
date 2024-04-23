package view;

import java.util.ArrayList;

import controller.CanzoniCtrl;
import model.Canzone;

public class app {

	public static void main(String[] args) {
		
		
		CanzoniCtrl database=new CanzoniCtrl();
		database.caricaCanzoniDaFile();
		
		System.out.println("Stampo tutte le canzoni presenti: ");
		ArrayList<Canzone> tutteCanzoni=database.canzoni;
		for (Canzone canzone : tutteCanzoni) {
			System.out.println(canzone.titolo+" "+canzone.cantante);
		}

	}

}
