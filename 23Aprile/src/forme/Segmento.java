package forme;

public class Segmento {
	
	// un segmento è definito da due punti
	public Punto a,b;
	public double lunghezza;

	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
	}
	
	public double calcolaLungSegmento() {
		//radice di [(bx-ax)^2 +(by-ay)^2]
		this.lunghezza=Math.sqrt((Math.pow((b.x-a.x),2))+(Math.pow((b.y-a.y),2)));
		return this.lunghezza;
	}

	@Override
	public String toString() {
		return "Segmento [a=" + a + ", b=" + b + ", lunghezza=" + lunghezza + "]";
	}
}
