package com.mattiascojan.collezioni;

import java.util.ArrayList;

public class ProvaListe {

	public static void main(String[] args) {
	
		String[] naniArr= {
				"pisolo","mammolo","gongolo","brontolo","eolo","dotto","cucciolo"
			};
		ArrayList<String> nani=new ArrayList<String>();
		//arraylist implementa list(uno genitore dell'altro)
		for (String nano: naniArr) {
			nani.add(nano);
		}
		for (String nano : nani) {
			System.out.println(nano);
		}
//////////////////////////////////////////////////////////////////////
		 
		
		
		
		
	}

}
