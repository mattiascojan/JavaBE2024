package bloccoNote;

public class BloccoNote {
	
	String nome="Blocco note di Dario.";
	Nota[] elencoNote=new Nota[10]; //uso un oggetto all'interno di un altro oggett
	
	public void addNota(String titolo, String descrizione, int posizione) {
		Nota n=new Nota(titolo, descrizione);
		elencoNote[posizione]=n;
	}
	public void stampaBloccoNote() {
		for(int i=0;i<elencoNote.length;i++) {
			if(elencoNote[i]!=null) {
				System.out.println(elencoNote[i].stampaNota());
			}
		}
	}
	public void pulisciBloccoNote() {
		for(int i=0;i<elencoNote.length;i++) {
			elencoNote[i]=null;
		}
	}//svuota completamente il blocco note
	public int calcolaPosizioniRestanti() {
		int cont=0;
		for(int i=0;i<elencoNote.length;i++) {
			if(elencoNote[i]!=null) {
				cont++;
			}
		}
		return cont;
	}
	
	
	
}