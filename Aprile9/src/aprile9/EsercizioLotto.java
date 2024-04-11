package aprile9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class EsercizioLotto {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		Random r= new Random();
		int domanda=1;
		
		do {
			ArrayList<Integer> numeri=new ArrayList<>();
			System.out.println("Quanti numeri vuoi estrarre?");
			int x=s.nextInt();
			System.out.println("I numeri usciti sono:");
			for(int i=0;i<x;i++) {
				int numeroCasuale=r.nextInt(1,91);
				if(numeri.contains(numeroCasuale)) {
					i--;
				}else {
					numeri.add(numeroCasuale);
				};
			};
			System.out.println(numeri);
		}while(domanda==0);
		
		
//		do {
//			ArrayList<Integer> numeri=new ArrayList<>();
//			for(int i=1;i<91;i++) {
//				numeri.add(i);
//			}
//			System.out.println("Quanti numeri vuoi estrarre?");
//			int x=s.nextInt();
//			System.out.println("I numeri usciti sono:");
//			for(int i=0;i<x;i++) {
//				int numeroCasuale=r.nextInt(1,numeri.size());
//				System.out.print(numeri.get(numeroCasuale)+" ");
//				numeri.remove(numeroCasuale);
//			}
//			System.out.println();
//			System.out.println("Se vuoi rifarlo inserisci 0, se no esci");
//			domanda=s.nextInt();
//		}while(domanda==0);
		
		
		
	}

}
