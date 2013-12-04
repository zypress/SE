package Hausaufgabe8;

import java.util.ArrayList;

public class Rechnung {
	private ArrayList<Artikel> artikelList;
	private FormatStrategie format;

	public Rechnung() {
		artikelList = new ArrayList<Artikel>();
	}

	public void add(Artikel artikel) {
		artikelList.add(artikel);
	}

	public void drucken() {
			format.drucken(artikelList);
	}
   
	public void setFormatStrategie(FormatStrategie formatStrategie){
        this.format = formatStrategie;
    }
	
	public static void main(String[] args){
		  Rechnung rechnung = new Rechnung();
		  rechnung.add(new Artikel("Festplatte",89.99));
		  rechnung.add(new Artikel("USB-Stick",19.99));
		  rechnung.add(new Artikel("Mauspad",3.33));
		  rechnung.setFormatStrategie(new TextFormat());
		  rechnung.drucken();
          System.out.println();
          rechnung.setFormatStrategie(new HTMLFormat());
          rechnung.drucken();
	}
}
