package esercizioDado;

import java.util.Random;

public class Dado {
	
	int numFacce;
	Random numRand;

	public Dado(int numFacce) {
		this.numFacce = numFacce;
	} // costruttore shift alt s
	
	public int lancia() {
		numRand= new Random();
		int risultato=this.numRand.nextInt(1,this.numFacce+1);
		return risultato;
	} // metodo lancia che ci da una faccia da 1 a quelle contate
	
	public int truccaDado() {
		numRand= new Random();
		int risultato=this.numRand.nextInt(3,6);
		return risultato;
	}
	
}

