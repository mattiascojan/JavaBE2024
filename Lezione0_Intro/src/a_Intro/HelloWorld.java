package a_Intro;

public class HelloWorld {

	public static void main(String[] args) {
		
//		dichiaro e assegno delle variabili
		
		String mioNome = "Dario";
		String mioCognome = "Mennillo";
		
		int eta = 35;
		eta++;
		
		
//		Dichiaro
		String corso;
//		Assegno un valore
		corso = "Java Back End";
		
		var istituto = "Immaginazione e lavoro";
		istituto = "Lavoro e immaginazione";

		var numCivico = 0.23;
		numCivico++;
		
		

		String saluto = "Ciao " + mioNome + " " + mioCognome + " ho " + eta + " anni." + "\n Lavoro con " + istituto +" al num " + numCivico + " di via Carlo Alberto" ;		
		
		System.out.println(saluto);
				
	}

}
