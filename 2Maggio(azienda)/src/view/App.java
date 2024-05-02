package view;

import controller.AziendaController;
import model.Dipendente;

public class App {
	
	public static void main(String[] args) {
		
		AziendaController azienda=new AziendaController("Plutos&Pippos");
		
		azienda.addDipendente("Mario", "Rossi","Manager");
		azienda.addDipendente("Laura", "Verdi","Manager");
		azienda.addDipendente("Fra", "Tello","Manager");
		
		for(Dipendente dip: azienda.getListaDipendenti()) {
			System.out.println(dip.presentati());
			System.out.println(dip.getStipendio());
		}
	}
	
	
}
