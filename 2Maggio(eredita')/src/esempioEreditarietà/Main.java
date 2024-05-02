package esempioEreditarietà;

public class Main {

	public static void main(String[] args) {
		
		Smartphone sp1=new Smartphone(0, "S22", "un telefono figo", 499, "Samsung", 6.5, 8, 128);
		
		System.out.println(sp1.descriviProdotto());
		//uso il metodo della classe"madre" Prodotto, in un oggetto"figlio" Smartphone
		
		
	
	}

}
