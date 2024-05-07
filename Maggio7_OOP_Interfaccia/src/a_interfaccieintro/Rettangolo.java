package a_interfaccieintro;

public class Rettangolo implements FiguraGeometrica {
	
	private double lato1;
	private double lato2;
	
	private double area;
	private double perimetro;
	
//////////////////////////////////////////////////
	public Rettangolo(double lato1, double lato2) {
		this.lato1 = lato1;
		this.lato2 = lato2;
	}
///////////////////////////////////////////////////
	@Override
	public double calcolaArea() {
		this.area=this.lato1*this.lato2;
		return area;
	}
	@Override
	public double calcolaPerimetro() {
		this.perimetro=2*(this.lato1+this.lato2);
		return perimetro;
	}
	@Override
	public String presentaFigura() {
		String figura="Rettangolo: \narea "+this.area+"\nperimetro: "+this.perimetro;
		return figura;
	}
///////////////////////////////////////////////////
	
	
	
	
	
	
	
}
