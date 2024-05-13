package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Set;

import controller.CanzoniCtrl;
import model.Canzone;

public class ProvaJukeBox {

	public static void main(String[] args) throws FileNotFoundException {

		File f = new File("C:\\Users\\B22-126-2024\\Desktop\\canzoni.txt");
		CanzoniCtrl jukebox = new CanzoniCtrl();
		
		try {
			Scanner sc = new Scanner(f);
			
			while (sc.hasNextLine()) {
				String riga = sc.nextLine();
				
				String[] split = riga.split(";");
				String titolo = split[0];
				String cantante = split[1];
				
				//Canzone c = new Canzone(titolo, cantante);
				
				jukebox.addCanzone(titolo, cantante);
				
				//System.out.println(c);
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Set<String> cantanti = jukebox.getCantanti();
		
		cantanti
			.stream()
			.filter(c -> c.startsWith("The"))
			.filter(c -> c.endsWith("s"))
			.sorted()
			.forEach(
					c -> System.out.println(c)
				);

		PrintWriter output = new PrintWriter("files/cantanti.html");
		
		output.println("<ul>");//apri unordered list
		for (String cantante : cantanti) {
			//System.out.println(cantante);
			output.println("<li>"+cantante+"</li>");//list item
		}
		output.println("</ul>");//chiudi unordered list
		output.close();
		
	}

}