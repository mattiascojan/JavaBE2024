package forme;

public class Rettangolo {
	
	Segmento base, altezza;

	public Rettangolo(Segmento base, Segmento altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public double getPerimetro() {
		double perimetro=2*(base.calcolaLungSegmento()+altezza.calcolaLungSegmento());
		return perimetro;
	}
	
	public double getArea() {
		double area=base.calcolaLungSegmento()*altezza.calcolaLungSegmento();
		return area;
	}

	@Override
	public String toString() {
		return "Rettangolo [base=" + base + ", altezza=" + altezza + ", getPerimetro()=" + getPerimetro()+ ", getArea()=" + getArea() + "]";
	}
	
	
	
	
	
	
}
