package Hausaufgabe8;

import java.util.ArrayList;


public class HTMLFormat implements FormatStrategie {

	@Override
	public void drucken(ArrayList<Artikel> artikelList) {
		System.out.println("<table>");
		for (int i=0; i < artikelList.size();i++) {
		System.out.println("  <tr>\n    <td>Artikel</td>\n    <td>Preis</td>\n  <tr>\n    <td>"
											+ artikelList.get(i).getBezeichnung()
                                            + "</td>\n    <td>"
                                            + artikelList.get(i).getPreis() + "</td>\n  </tr>");
		}
		System.out.println("</table>");
	}
}
