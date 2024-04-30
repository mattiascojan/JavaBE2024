package view;

import java.util.ArrayList;

import controller.CanzoniCtrl;
import controller.PlaylistCtrl;
import model.Canzone;

public class app {

	public static void main(String[] args) {
		
		CanzoniCtrl dbb=new CanzoniCtrl();
		dbb.caricaCanzoniDaFile();
		
		ArrayList<Canzone> allSongs=dbb.canzoni;
		for (Canzone canzone : allSongs) {
			System.out.println(canzone.titolo+" - "+canzone.cantante);
		}
		
		PlaylistCtrl playlist=new PlaylistCtrl("Prima playlist");
		Canzone canzoneDaAggiungere=new Canzone(allSongs.get(0).titolo,allSongs.get(0).cantante);
		playlist.addCanzone(null);
		playlist.infoPlayList();
		System.out.println(canzoneDaAggiungere);
		

		
	}

}
