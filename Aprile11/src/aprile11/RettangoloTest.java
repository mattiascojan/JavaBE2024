package aprile11;

public class RettangoloTest {

	//dichiaro attributi(proprietà) all'interno della mia classe
	int base, altezza;
	
	public static void main(String[] args) {
		
	//qui posso costruire l'oggetto rettangoloTest utilizzando la parola chiave new
		
	//ATT: quando uso la parola chiave new sto facendo uso del "Costruttore di Defaul".
	// I costruttori hanno lo stesso nome della classe
		
	//creo un nuovo oggetto "rettangolo" ISTANZA della classe Rettangolo test
		RettangoloTest rettangolo=new RettangoloTest();
		
		rettangolo.altezza=5;
		rettangolo.base=6;
		
		int area=rettangolo.altezza*rettangolo.base;
		int perimetro=(rettangolo.altezza+rettangolo.base)*2;
		
		System.out.println("L'altezza vale: "+rettangolo.altezza);
		System.out.println("La base vale: "+rettangolo.base);
		System.out.println("L'area vale: "+area);
		System.out.println("Il perimetro vale: "+perimetro);
		
		
		//RettangoloTest() con le parentesi è il costruttore
		//senza è un nuovo TIPO, complesso
		RettangoloTest rettangolo2=new RettangoloTest();
		rettangolo2.base=4;
		rettangolo2.altezza=8;
		int area2=rettangolo2.base*rettangolo2.altezza;
		int perimetro2=(rettangolo2.altezza+rettangolo2.base)*2;
		System.out.println("L'area del rettangolo2 vale: "+area2);
	
	}
	
	
	
}
