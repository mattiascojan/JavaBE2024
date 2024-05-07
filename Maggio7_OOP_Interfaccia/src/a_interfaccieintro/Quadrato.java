package a_interfaccieintro;

public class Quadrato extends Rettangolo{
	
	private double lato;
	
	public Quadrato(double lato) {
		super(lato, lato);
		this.lato=lato;
	}
///////////////////////////////////////////////////////
	
	public String presentaFigura() {
		String figura="Quadrato: \narea"+this.calcolaArea()+"\nperimetro: "+this.calcolaPerimetro();
		return figura;
	}
	
	
	
	
}
