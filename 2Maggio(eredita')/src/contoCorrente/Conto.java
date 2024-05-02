package contoCorrente;

public class Conto {

	private double numconto;
	private String intestatario;
	private double saldo;
	private String pinCarta;
	
	
	
////////////////////////////////////////////////////////////////	
	public double getNumconto() {
		return numconto;
	}
	public void setNumconto(double numconto) {
		this.numconto = numconto;
	}

	public String getIntestatario() {
		return intestatario;
	}
	public void setIntestatario(String intestatario) {
		this.intestatario = intestatario;
	}

	public double getSaldo() {
		return saldo;
	}// setSaldo lo elimino, non posso variarlo dal nulla

	public void setPinCarta(String pinCarta) {
		this.pinCarta = pinCarta;
	}// getPinCarta non serve, autogenerato, non posso vederlo
//////////////////////////////////////////////////
	
	public String preleva(String pin, double importo) {
		if(pin.equals(pinCarta)) {
			if(importo<this.saldo) {
				this.saldo=this.saldo-importo;
				return ("Hai prelevato: "+importo+"euro.\tSaldo attuale: "+this.saldo+"euro.");						
			}else {
				return "non hai abbastanza soldi";
				}
		}else {
			return "pin errato";
		}
	}
	
	public String deposita(String pin, double importo) {
		if(pin.equals(pinCarta)) {
				this.saldo=this.saldo+importo;
				return ("Hai depositato: "+importo+"euro.\tSaldo attuale: "+this.saldo+"euro.");
		}else {
			return "pin errato";
		}
	}
	
}
