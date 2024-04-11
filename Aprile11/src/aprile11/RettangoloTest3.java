package aprile11;

public class RettangoloTest3 {
	double altezza;
	double base;
	String nomeFigura;
	
//	//il metodo costruttore di DEFAULT lo vado a scrivere solo se ne faccio uso
//	public RettangoloTest3(double altezza, double base) {
//		super();//autogenerato, non necessario
//		this.altezza = altezza;
//		this.base = base;
//	}//usando altShiftS, generate costructor using field; GENERO LE ULTIME 4 RIGHE

	public RettangoloTest3(double altezza, double base, String nomeFigura) {
		super();
		this.altezza = altezza;
		this.base = base;
		this.nomeFigura = nomeFigura;
	}//costruttore con anche nome figura //OVERLOAD
	
	
	//costruisco dei metodi per la mia classe //CHE POSSONO RIDARCI QUALCOSA
	public double calcolaArea() {
		double area=this.altezza*this.base;
		return area;
	}//se non voglio restiduire niente metto "void" invece di "double" sulla riga 24
	
	public double calcolaVolume(double profondita) {
		//double volume=this.altezza*this.base*profondita;
		double volume=calcolaArea()*profondita;
		return volume;
	}//posso usare sia dati inizializzati sopra sia dentro al main

	//uso il metodo tostring usando altShiftS
	@Override
	public String toString() {
		return "RettangoloTest3 [altezza=" + altezza + ", base=" + base + ", nomeFigura=" + nomeFigura + "]";
	}
	

	
	
	public static void main(String[] args) {
		
		RettangoloTest3 rettangolo=new RettangoloTest3(8.5, 6.4, "rettangolino");
		
		System.out.println("L'area del "+rettangolo.nomeFigura+" vale: "+rettangolo.calcolaArea());
		//calcolaAre() restituisce un valore che potremmo approssimare
		
		System.out.println("Il volume con 4 di profondità vale: "+rettangolo.calcolaVolume(4));
		System.out.println(rettangolo); //non serve richiamare il metodo toString()
		
		
		
		
		
	}


}
