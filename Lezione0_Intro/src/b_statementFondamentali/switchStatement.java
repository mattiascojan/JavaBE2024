package b_statementFondamentali;

public class switchStatement {
	
	public static void main(String[] args) {
		
		int livello = 0;
		
		switch(livello) {
		case 1:
			System.out.println("Bravo, sei al primo livello");
			break;
			
		case 2:
			System.out.println("Adesso ti tocca il secondo livello");
			break;
		case 3:
			System.out.println("Questo è il livello finale");
			break;
		default:
			System.out.println("Benvenuto nel gioco!!");
			break;
		}
		
	}

}
