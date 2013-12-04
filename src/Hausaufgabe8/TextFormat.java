package Hausaufgabe8;

import java.util.ArrayList;


public class TextFormat implements FormatStrategie{

	@Override
	public void drucken(ArrayList<Artikel> artikelList) {
		for (int i=0; i < artikelList.size();i++) {
			System.out.println(artikelList.get(i).getBezeichnung() + ": " + artikelList.get(i).getPreis());
		}
	}

}
