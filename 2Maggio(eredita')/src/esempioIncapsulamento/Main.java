package esempioIncapsulamento;

public class Main {

	public static void main(String[] args) {
	
		Display d1=new Display("DispAAA","A03","1080x720");
		Display d2=new Display(); // un display con tutti i dati non settati
				
//		System.out.println("La marca del mio display è: "+d1.marca);
//		d1.marca non funziona, perche marca è PRIVATE
		
//		COME ACCEDERE A DATI PRIVATE:
//		ALT SHIFT S: GETTERS:
		System.out.println("Display 1: "+d1.getMarca()+" "+d1.getModello("password")+" "+d1.getRisoluzione());
//		sto richiamando i metodi get, messi nella classe "Display"
		
		System.out.println(d1.getModello("password"));
		System.out.println(d1.getModello("passwo"));
//		se sbaglio la password non accedo al contenuto e ho messo che ci da un errore
		
//		ALT SHIFT S: SETTERS:
		d2.setMarca("DispBBB");
		d2.setModello("ABC3");
		d2.setRisoluzione("1920x1080");
		System.out.println("Display 1: "+d2.getMarca()+" "+d2.getModello("password")+" "+d2.getRisoluzione());
/////////////////////////////////////////////////////////////////////
		
		Tablet t1=new Tablet(); //nella classe tablet non ho costruttori
		t1.setMarca("Samsung");
		t1.setModello("S10");
		t1.setImeiSerial("gigangoagn");
		t1.setDisplay(d1);
		
		System.out.println(t1.toString());
//		ci da:
//		Tablet [imeiSerial=gigangoagn, marca=Samsung, modello=S10,
//		display=esempioIncapsulamento.Display@57fa26b7]
//		PER CAMBIARE LA RIGA 38 DOVRO' CAMBIARE NEL TABLET, display in display.toString
		System.out.println(t1.toString());
//		=Display [marca=DispAAA, modello=A03, risoluzione=1080x720]]
		

	}

}
