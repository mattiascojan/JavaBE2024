package b_statementFondamentali;

public class IfStatement {
	public static void main(String[] args) {
	
		
	//soglia di superamento é 20
	int punteggio = 26;
	int soglia = 20;
	
	boolean condizione = (punteggio >= soglia);
	
	//if(condizione){}
	
//	if(condizione) {
//		System.out.println("Bravo, hai superato il livello");
//	}else {
//		System.out.println("mi spiace, livello non superato");
//	}
	
	//La condizione può essere anche valutata direttamente
	if(punteggio >= soglia) {
		System.out.println("bravo");
	}else {
		System.out.println("Non hai superato il livello");
	}
	
//////////////Gioco : per poter vincere il mio giuocatore deve avere entrambi i punteggi sopra soglia
	int punteggioLvl = 21;
	int sogliaPuntLvl = 20;
	
	int skillLvl = 29;
	int sogliaSkillLvl = 30;
	
	System.out.println("----------HARD MODE--------");
	//operatori logici && || !
	if((punteggioLvl >= sogliaPuntLvl) && (skillLvl >= sogliaSkillLvl)) {
		System.out.println("Bravo, hai superato il livello");
	}else if((punteggioLvl < sogliaPuntLvl) && (skillLvl >= sogliaSkillLvl)) {
		System.out.println("Mi spiace, i tuoi punteggi sono sotto la soglia !!");
	}else if((punteggioLvl >= sogliaPuntLvl) && (skillLvl < sogliaSkillLvl)) {
		System.out.println("Mi spiace, le tue skill sono sotto soglia");
	}else {
		System.out.println("Non hai superato il livello perché tutti i punti non raggiungono la soglia!!");
	}
		
	//EASY MODE
	System.out.println("---------EASY MODE-----------");
	if((punteggioLvl >= sogliaPuntLvl) || (skillLvl >= sogliaSkillLvl)) {
		System.out.println("Bravo, hai superato il livello");		
	}else {
		System.out.println("Mi spiace, livello non superato");
	}
	
	}
}
