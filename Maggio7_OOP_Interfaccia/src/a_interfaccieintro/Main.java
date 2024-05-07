package a_interfaccieintro;

public class Main {

	public static void main(String[] args) {
		
		Rettangolo r=new Rettangolo(5.3,7.1);
		r.calcolaArea();
		r.calcolaPerimetro();
		System.out.println(r.presentaFigura());
		
		Cerchio c=new Cerchio(5);
		c.calcolaArea();
		c.calcolaPerimetro();
		System.out.println(c.presentaFigura());
		
		Quadrato q=new Quadrato(6.4);
		q.calcolaArea();
		q.calcolaPerimetro();
		System.out.println(q.presentaFigura());
		
		Triangolo t=new Triangolo(1, 1, 1);
		t.calcolaArea();
		t.calcolaPerimetro();
		System.out.println(t.presentaFigura());
		// bisogna controllare se il triangolo esiste
		
		
	}
}
