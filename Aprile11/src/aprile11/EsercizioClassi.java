package aprile11;

import java.util.Scanner;

public class EsercizioClassi {
	//CREARE UNA CALCOLATRICE
	double primoNumero;
	double secondoNumero;
	

	public EsercizioClassi(double primoNumero, double secondoNumero) {
		this.primoNumero = primoNumero;
		this.secondoNumero = secondoNumero;
	}
	
	
	public double calcolaSomma() {
		double somma=this.primoNumero+this.secondoNumero;
		return somma;
	}
	public double calcolaDifferenza() {
		double differenza=this.primoNumero-this.secondoNumero;
		return differenza;
	}
	public double calcolaProdotto() {
		double prodotto=this.primoNumero*this.secondoNumero;
		return prodotto;
	}
	public double calcolaDivisione() {
		double quozionte=this.primoNumero/this.secondoNumero;
		return quozionte;
	}
	
	public double calcola(char operazione) {
	double risultato=0;
	switch (operazione) {
	case '+':
		risultato=calcolaSomma();
		break;
	case '-':
		risultato=calcolaDifferenza();
		break;
	case '*':
		risultato=calcolaProdotto();
		break;
	case '/':
		risultato=calcolaDivisione();
		break;
}
	return risultato;
}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char operazione;
		do{
			System.out.println("Che operzione vuoi fare? (+,-,*,/)");
			System.out.println("Se sbagli richiedo");
			operazione=s.next().charAt(0);
		}while(operazione!='+'&&operazione!='-'&&operazione!='*'&&operazione!='/');
		
		System.out.println("Dammi i due numeri");
		int n1=s.nextInt();
		int n2=s.nextInt();
		EsercizioClassi esercizio=new EsercizioClassi(n1, n2);
		
		System.out.println("Il risultato con CALCOLA VALE:"+esercizio.calcola(operazione));
		
//		switch (operazione) {
//		case '+':
//			System.out.println("Il risultato della tua operazione vale:"+esercizio.calcolaSomma());
//			break;
//		case '-':
//			System.out.println("Il risultato della tua operazione vale:"+esercizio.calcolaDifferenza());
//			break;
//		case '*':
//			System.out.println("Il risultato della tua operazione vale:"+esercizio.calcolaProdotto());
//			break;
//		case '/':
//			System.out.println("Il risultato della tua operazione vale:"+esercizio.calcolaDivisione());
//			break;
//	}
		
	}
	
	
	
	
	
}
