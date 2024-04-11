package aprile11;

public class RettangoloTest2 {
	double altezza;
	double base;
	
	//Attenzione: esiste un costruttore di default affidato ad ogni classe, il seguente:
	//il seguente metodo costruttore è a firma vuota. La firma di un metodo è l'insieme
	//del nome e dei parametri passati in ingresso
	public RettangoloTest2() {
		super();
	}//non si definisce mai quello di default di solito
	
	//Creo il metodo costruttore
	//IL COSTRUTTORE DEVE AVERE LO STESSO NOME DELLA CLASSE
	public RettangoloTest2(double altezza, double base) {
		this.altezza=altezza;
		this.base=base;
	//this.altezza (fa riferimento alla proprietà di classe)=
		//=altezza (fa rimerimento al parametro passato al costruttore)
	}
	
	
	public static void main(String[] args) {
	//utilizzo il costruttore del rettangolo
		RettangoloTest2 rettangolo=new RettangoloTest2(4.2, 7.4);
		//rettangolo.altezza diventerà direttamente 4.2; senza dover inserire noi
		System.out.println(rettangolo.altezza);
		System.out.println(rettangolo.base);
		
		double area=rettangolo.altezza*rettangolo.base;
		double perimetro=(rettangolo.altezza+rettangolo.base)*2;
		System.out.println("L'area vale: "+area);//non rettangolo.area
		System.out.println("Il perimetro vale: "+perimetro);
		
	}
	
	
	
	
}
