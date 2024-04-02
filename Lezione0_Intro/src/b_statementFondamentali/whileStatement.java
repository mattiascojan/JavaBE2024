package b_statementFondamentali;

public class whileStatement {

	public static void main(String[] args) {
	//fintanto che la condizione è valida, tu esegui
//		int n = 5;
//		int numGiri = 0;
//		
//		while(n == 5) {
//			numGiri++;
//			
//			System.out.println("Giro num " + numGiri);
//			
//			double numCasuale = Math.random();
//			
//			System.out.println("Il num casuale è : " + numCasuale);
//			
//			if(numCasuale < 0.2) {
//				n = 7;
//				System.out.println("Qui termina il while");
//			}
//		}

		int numGiri = 0;
		int giriPersi = 0;
		
		while(numGiri <= 10) {
			double numRand = Math.random();

			if(numRand < 0.2) {
				giriPersi++;
				System.out.println("Hai perso questo giro");

//				Per interrompere il ciclo rendo la condizione false
//				numGiri = 11;
				break;
			}
			System.out.println(numRand);
			
			numGiri++;
		}
		
		
		
	}
}
