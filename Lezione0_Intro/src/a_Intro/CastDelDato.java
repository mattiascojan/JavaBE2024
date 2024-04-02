package a_Intro;

public class CastDelDato {

	public static void main(String[] args) {
		
		int num1 = 52;
		int num2 = 24;
		
		
		int somma = num1 + num2;
		System.out.println("La somma vale" + somma);

		int differenza = num1 - num2;
		System.out.println("La differenza vale " + differenza);

		int prodotto = num1 * num2;
		System.out.println("Il prodotto vale " + prodotto);
		
		double quoziente = (double) num1 / num2;
		System.out.println("Il quoziente vale " + quoziente);
	
		int restoDiv = num1 % num2;
		System.out.println("Il resto della divisione " + restoDiv);
		
		//uso della classe Math
		double valore = 3.12057;
		
//		Math.round() arrotonda all'intero sup o inf in base al valore del numero che gli passiamo
		long valoreArrotondato = Math.round(valore);
		System.out.println(valoreArrotondato);
		
		//Math.abs() restituisce il valore assoluto di un numero(la parte positiva)
		int numNeg = -47;
		int numNegAbs = Math.abs(numNeg);
		System.out.println(numNegAbs);
		
		double numRand = Math.random() * 10;
		int intSup = (int) Math.ceil(numRand);
		
		System.out.println(numRand);
		System.out.println(intSup);
		
		double radice = Math.sqrt(45254);
		System.out.println(radice);
		
	}
}
