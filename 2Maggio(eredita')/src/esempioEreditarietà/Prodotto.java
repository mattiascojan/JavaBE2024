package esempioEreditarietà;

public class Prodotto {
	
	public int id;
	public String nome;
	public String descrizione;
	public double prezzo;
	public String marca;
	
	public static final String TIPOPRODOTTO="Prodotto Generico";
	// costante alla classe prodotto, non ai prodotto instanziati
	// final=immutabile (costante tutta in MAIUSCOLO)

	
	// COSTRUTTORE
	public Prodotto(int id, String nome, String descrizione, double prezzo, String marca) {
		this.id = id;
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.marca = marca;
	} // qui dentro non troviamo TIPOPRODOTTO, perchè è una costante e non serve nel costruttore
	
	
	// METODI
	public String descriviProdotto() {
		String descrizione="Informazioni: "+this.nome+" - "+this.marca+" - "+this.prezzo+" euro.";
		return descrizione;
	}
	
	
	
	
	
	
	
	
	
	
	
}
