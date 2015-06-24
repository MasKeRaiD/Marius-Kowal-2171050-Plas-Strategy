import java.util.*;

public class Artikel {
	private String artikelbezeichnung;
	private double einzelpreis;
	
	public Artikel(String artikelbezeichnung, double Einzelnpreis){
		this.artikelbezeichnung = artikelbezeichnung;
		this.einzelpreis = einzelpreis;
	}
	
	public static void main(String[] args){
		Artikel artikel = new Artikel("Festplatte",89.99);
		Artikel artikel2 = new Artikel("USB-Stick",19.99);
		Artikel artikel3 = new Artikel("Mauspad",3.33);
		Rechnung rechnung = new Rechnung();
		rechnung.add(artikel);
		rechnung.add(artikel2);
		rechnung.add(artikel3);
		
	}
	
	

}
