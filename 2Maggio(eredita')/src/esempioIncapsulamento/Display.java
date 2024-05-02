package esempioIncapsulamento;

public class Display {

	private String marca;
	private String modello;
	private String risoluzione;
	
	public Display(String marca, String modello, String risoluzione) {
		this.marca = marca;
		this.modello = modello;
		this.risoluzione = risoluzione;
	}
	public Display() {
	}

//	ALT SHIFT S: GETTERS AND SETTERS:
	public String getMarca() {
		return marca;
	} // ci da la marca
	public void setMarca(String marca) {
		this.marca = marca;
	} // ci fa cambiare la marca

	public String getModello(String password) {
		// posso mettere una password per sapere un dato
		if(password=="password") {
			return modello;
		}else {
			return "errore";
		}
	}
	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getRisoluzione() {
		return risoluzione;
	}
	public void setRisoluzione(String risoluzione) {
		this.risoluzione = risoluzione;
	}
///////////////////////////////////////////////////////////
	@Override
	public String toString() {
		return "Display [marca=" + marca + ", modello=" + modello + ", risoluzione=" + risoluzione + "]";
	}
	
	
	

	
	
	
	
	
}
