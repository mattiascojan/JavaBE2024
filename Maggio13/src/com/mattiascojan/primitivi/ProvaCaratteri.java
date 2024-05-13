package com.mattiascojan.primitivi;

public class ProvaCaratteri {

	public static void main(String[] args) {
		
		//4 tipi interi
		byte b=12; //8bit
		short s=12; //16bit
		int intero=12; //32bit
		long l=12; //64bit
		// 2 tipi reali
		float f=12.0f; //32 bit
		double d=12.0d; //64bit
		
		//1 tipo boolean
		boolean gira=true;
		//1 tipo carattere
		char a='a'; //o '\n'
		for(int i=0;i<256;i++) {
			System.out.print((char) i+" ");
			if(i%80==0&&i>0) {
				System.out.println();
			}
		}
////////////////////////////////////////////////		
		
		
		
		
		
		
		
		
		
	}
}
