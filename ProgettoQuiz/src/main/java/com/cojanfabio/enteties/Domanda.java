package com.cojanfabio.enteties;

public class Domanda {
	
	private String paese;
	private String capitale1;
	private String capitale2;
	private String capitale3;
	
////////////////////////////////////////////////////////	
	public Domanda(String paese, String capitale1, String capitale2, String capitale3) {
		this.paese = paese;
		this.capitale1 = capitale1;
		this.capitale2 = capitale2;
		this.capitale3 = capitale3;
	}

//////////////////////////////////////////////////////////	
	public String getPaese() {
		return paese;
	}

	public void setPaese(String paese) {
		this.paese = paese;
	}

	public String getCapitale1() {
		return capitale1;
	}

	public void setCapitale1(String capitale1) {
		this.capitale1 = capitale1;
	}

	public String getCapitale2() {
		return capitale2;
	}

	public void setCapitale2(String capitale2) {
		this.capitale2 = capitale2;
	}

	public String getCapitale3() {
		return capitale3;
	}

	public void setCapitale3(String capitale3) {
		this.capitale3 = capitale3;
	}
	
}
