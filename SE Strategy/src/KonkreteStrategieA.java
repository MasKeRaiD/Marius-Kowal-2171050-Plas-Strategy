import java.util.ArrayList;
import java.util.List;


public class KonkreteStrategieA implements Strategie{
	Rechnung rechnung = new Rechnung();
	public void algorithmus() {
		List<Artikel> liste2 = new ArrayList<Artikel>();
		liste2 = rechnung.getList();
		System.out.println(liste2.get(1));
		System.out.println(liste2.get(2));
		System.out.println(liste2.get(3));
		
	}
}
