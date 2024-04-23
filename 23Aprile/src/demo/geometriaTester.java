package demo;

import forme.Punto;
import forme.Quadrato;
import forme.Rettangolo;
import forme.Segmento;
import forme.Triangolo;

public class geometriaTester {

	public static void main(String[] args) {
		
		Punto a=new Punto(2, 3);
		Punto b=new Punto(5, 3);
		Punto c=new Punto(4, 8);
		
		Segmento ab=new Segmento(a, b);
		Segmento bc=new Segmento(b, c);
		
		// creo un quadrato
		Quadrato q1=new Quadrato(ab);
		System.out.println("Il perimetro del quadrato con lato ab: "+q1.getPerimetro());
		System.out.println("L'area del quadrato con lato ab: "+q1.getArea());
		// sto usando i metodi di Rettangolo(), con l'ereditarietà, dentro un Quadrato()
		
		// se non definisco un "toString" in Quadrato(), prenderà quello definito dentro Rettangolo()
		System.out.println(q1.toString());
		
		
		// creo un triangolo
		Triangolo tr1=new Triangolo(a, b, c);
		System.out.println(tr1.toString());
		System.out.println("Il perimetro del triangolo: "+tr1.getPerimetro());
		System.out.println("L'area del triangolo: "+tr1.getArea());
		
		
		//creo un rettangolo
		Rettangolo ret1=new Rettangolo(ab, bc);
		System.out.println("Il perimetro del rettangolo: "+ret1.getPerimetro());
		System.out.println("L'area del rettangolo: "+ret1.getArea());
		
	}

}
