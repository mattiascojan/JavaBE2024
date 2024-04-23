package forme;

public class Triangolo {
	
	public Punto a,b,c;
	public Segmento ab,bc,ca;
	
	//adesso definisco il costruttore del triangolo partendo solo da tre punti
	public Triangolo(Punto a, Punto b, Punto c) {
		this.a = a;
		this.b = b;
		this.c = c;
		//definisco dentro il costruttore i segmenti
		this.ab=new Segmento(a, b);
		this.bc=new Segmento(b, c);
		this.ca=new Segmento(c, a);
	}
	
	public double getPerimetro() {
		double perimetro=ab.calcolaLungSegmento()+bc.calcolaLungSegmento()+ca.calcolaLungSegmento();
		return perimetro;
	}
	
	public double getArea() {
		double sp=getPerimetro()/2;
		//uso la formula di Erone (per l'area, usando il semi perimetro
		double area=Math.sqrt(sp*(sp-ab.calcolaLungSegmento())*(sp-bc.calcolaLungSegmento())*(sp-ca.calcolaLungSegmento()));
		return area;
	}

	@Override
	public String toString() {
		return "Triangolo [a=" + a + ", b=" + b + ", c=" + c + ", ab=" + ab + ", bc=" + bc + ", ca=" + ca + "]";
	}
	
	
	
	
}
