import java.util.ArrayList;


public class GeraeteListe {
	private ArrayList<Geraet> geraeteListe;
	public GeraeteListe(){
		geraeteListe = new ArrayList<Geraet>();
	}
	public int getAnzahlGeraete(){
		return geraeteListe.size();
	}
	public void hinzufuegen(Geraet geraet){
		geraeteListe.add(geraet);
	}
	public void entfernen(Geraet geraet){
		geraeteListe.remove(geraet);
	}
	public Geraet finden(String bezeichnung){
		for(Geraet geraet: geraeteListe){
			if (geraet.getBezeichnung().equalsIgnoreCase(bezeichnung)){
				return geraet;
			}
		}
		throw new NoGeraetFoundException("Geraet "
				+ bezeichnung + " nicht gefunden");
	}
}
