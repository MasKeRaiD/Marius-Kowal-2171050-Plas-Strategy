import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class KonkreteStrategieB implements Strategie {
	Rechnung rechnung = new Rechnung();
	
	public void algorithmus() {
		List<Artikel> liste2 = new ArrayList<Artikel>();
		liste2 = rechnung.getList();
		System.out.println("<table>");
		System.out.println("  <tr>");
		System.out.println("    <td>Artikel</td>");
		System.out.println("    <td>Preis</td></tr>");
		System.out.println("  <tr>");
		System.out.println("     <td>" + liste2.get(1) + "</td></tr>");
		System.out.println("  </tr>");
		System.out.println("  <tr>");
		System.out.println("     <td>" + liste2.get(2) + "</td></tr>");
		System.out.println("  </tr>");
		System.out.println("  <tr>");
		System.out.println("     <td>" + liste2.get(3) + "</td></tr>");
		System.out.println("  </tr>");
		System.out.println("</table>");
	}
}
