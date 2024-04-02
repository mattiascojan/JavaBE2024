package a_Intro;

public class Stringhe {
	
	public static void main(String[] args) {
		
		String benvenuto = "Ciao benvenuto nell'app !!";
		
		//posso anche dichiarare una string utilizzando il suo costruttore
		String s1 = new String("Ciao utente");
		
		int s1Length = s1.length();
		System.out.println("La stringa s1 ha " + s1Length + " caratteri");
		
		int benvenutoLength = benvenuto.length();
		System.out.println("La stringa benvenuto ha " + benvenutoLength + " caratteri");
		
		//posso confrontare la misura delle due stringhe
		boolean misura = (s1Length == benvenutoLength);
		System.out.println("La misura è uguale ? " + misura);
		
		//ALTRI METODI PER STRINGHE
		String frase = "Il miglior browser al mondo è Edge !!";
		String fraseVera = frase.replaceAll("Edge", "Google Chrome");
		System.out.println(fraseVera);
		
		//Metodi per la ricerca (boolen)
		System.out.println(fraseVera.contains("Chrome"));
		System.out.println(fraseVera.contains("Firefox"));
		
		//Metodi per comparare (boolean)
		String frase2 = "Ciao a tutte !";
		String frase3 = "Ciao a tutte !";
		
		System.out.println(frase2.equalsIgnoreCase(frase3)); 
		
		
	}

}
