package forme;

//EREDITARIETA': con extends eredito prop  e metodi della classe genitore
public class Quadrato extends Rettangolo {
	//il quadrato è un rettangolo particolare
	
	public Segmento lato;
	
	public Quadrato(Segmento lato) { //ha al suo interno un altro costruttore piu piccolo
		super(lato,lato); //costruttore di rettangolo (piu piccolo)
		this.lato = lato; //estensione del costruttore piu piccolo
	} //con il costruttore importato, importo pure i metodi di Rettangolo
	
	@Override
	public String toString() {
		return "Quadrato [lato=" + lato + "]";
	}
}
