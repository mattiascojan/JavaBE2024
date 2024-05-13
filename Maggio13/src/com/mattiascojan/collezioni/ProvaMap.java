package com.mattiascojan.collezioni;

import java.util.HashMap;

public class ProvaMap {

	public static void main(String[] args) {
		
		HashMap<String, String[]>regioni=new HashMap<>();
		regioni.put("Piemonte", new String[]{"Torino","Asti"});
		regioni.put("Lombardia", new String[]{"Milano","Como"});
		regioni.put("Campania", new String[]{"Napoli","Salerno"});
		
		for (String citta: regioni.get("Piemonte")) {
			System.out.println(citta);
		}
		for (String citta: regioni.get("Lombardia")) {
			System.out.println(citta);
		}
	}

}
