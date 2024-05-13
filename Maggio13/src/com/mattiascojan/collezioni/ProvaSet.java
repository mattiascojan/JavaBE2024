package com.mattiascojan.collezioni;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.mattiascojan.model.Libro;

public class ProvaSet {

	public static void main(String[] args) {
		
		Set<String> nomi=new HashSet<>();
		nomi.add("Mattias");
		nomi.add("Marco");
		nomi.add("Denis");
		nomi.add("Marco");
		nomi.add("Raffaele"); // hashset
		nomi.add("Raffaele"); // non accetta i duplicati
		nomi.add("Raffaele"); // non li mette in ordine
		nomi.add("Simone");
		nomi.add("Raffaele");
		
//		for (String nome: nomi) {
//			System.out.println(nome); // non mi da i duplicati
//		}
		
		Set<String> nomi2=new TreeSet<>();
		nomi2.add("Mattias");
		nomi2.add("Marco");
		nomi2.add("Denis");
		nomi2.add("Marco");
		nomi2.add("Raffaele"); //treeset
		nomi2.add("Raffaele"); //non accetta duplicati
		nomi2.add("Raffaele"); //ordina in ordine alfabetico da solo
		nomi2.add("Simone");
		nomi2.add("Raffaele");
//		for (String nome: nomi2) {
//			System.out.println(nome);
//		}
//////////////////////////////////
		Libro l1=new Libro("zanna bianca",100,10);
		Libro l2=new Libro("manitu",120,12);
		Libro l3=new Libro("albachiara",140,8);
		
		Set<Libro> libreria=new HashSet<Libro>();
		libreria.add(l1);
		libreria.add(l2);
		libreria.add(l3);
		for (Libro libro : libreria) {
			System.out.println(libro);
		}
		
		 
	}
}
