package view;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import database.CanzoneDAO;
import database.CanzoneDAOImpl;
import model.Canzone;

public class ProvaScritturaSuDB {

	public static void main(String[] args) {
		
		CanzoneDAO dao=new CanzoneDAOImpl();
		
		
		
		File f=new File("C:\\Users\\B22-126-2024\\Desktop\\canzoni.txt");
//		try {
//			Scanner input=new Scanner(f);
//			while(input.hasNextLine()) {
//				String riga=input.nextLine();
//				String[] split=riga.split(";");
//				dao.addCanzone(new Canzone(split[0],split[1]));
//		
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		List<Canzone> canzones=dao.getCanzones(); //recupero tutta la tabella
		for (Canzone canzone : canzones) {
			System.out.print("Titolo:"+canzone.getCantante());
			System.out.println(". Cantante: "+canzone.getCantante());
		};
			
			
			
//		Canzone c=new Canzone("Sinceramente","annalisa");
//		Canzone c2=new Canzone("bum bum","rose villain");
//		//davide è una scimmia
//		dao.addCanzone(c);
//		dao.addCanzone(c2);	
		
		
		
		
		
		
	}

}
