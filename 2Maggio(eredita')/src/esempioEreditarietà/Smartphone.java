package esempioEreditarietà;

public class Smartphone extends Prodotto {

	public double polliciSchermo;
	public int memoriaRAM;
	public int memoria;
	
	//COSTRUTTORE EREDITATO
	public Smartphone(int id, String nome, String descrizione, double prezzo, String marca, double polliciSchermo, int memoriaRAM, int memoria) {
		super(id, nome, descrizione, prezzo, marca);
		this.polliciSchermo = polliciSchermo;
		this.memoriaRAM = memoriaRAM;
		this.memoria = memoria;
	}
	
	
	//OVERRIDE del metodo della classe"madre", potendolo cambiare
	@Override  
	public String descriviProdotto() {
		String descrizioneSmartphoneP=super.descriviProdotto()+" Ram: "+this.memoriaRAM+" HD:"+this.memoria+" - Schermo: "+this.polliciSchermo+" pollici.";
		return descrizioneSmartphoneP;
	}// sovrascrivo il comportamento di un metodo
	
				
	
	
	
	
	

}
