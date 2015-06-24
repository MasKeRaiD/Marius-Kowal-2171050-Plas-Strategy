import java.util.*;

public class Rechnung {
	
	private List<Artikel> liste = new ArrayList<Artikel>();
	
	public Rechnung() {
		this.liste = liste;
	}
	
	public List<Artikel> getList() {
		return liste;
	}
	public void add(Artikel artikel) {
		liste.add(artikel);
	}
	
	public void drucken() {
		for(Artikel current: liste) {
			System.out.println(current);
		}
	}
	
}
