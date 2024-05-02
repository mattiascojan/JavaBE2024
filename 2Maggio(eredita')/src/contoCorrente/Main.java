package contoCorrente;

public class Main {
	
	public static void main(String[] args) {
		
		Conto conto1=new Conto();
		conto1.setIntestatario("Mattias Cojan");
		conto1.setNumconto(1);
		conto1.setPinCarta("12345");
		System.out.println("Adesso puoi depositare soldi dentro al conto; ne hai: "+conto1.getSaldo());
		
		conto1.deposita("12345", 1000);// aggiungo soldi al saldo, usando il pin
		System.out.println(conto1.getSaldo());// guardo il saldo
		
		
		
		
		
	}
	
}
