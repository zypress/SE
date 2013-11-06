import java.util.*;


public class Workshop {
	private int nummer;
	private String bezeichnung;
	private Date datum;
	private Referent ref;
	public ArrayList<Teilnehmer> teilnehmerList;
	
	public void Workshop (int nummer, String bezeichnung, Date datum, Referent ref){
		this.nummer = nummer;
		this.bezeichnung = bezeichnung;
		this.datum = datum;
		this.ref = ref;
	}
	@Override
	public String toString() {
		return "Workshop [nummer=" + nummer + ", bezeichnung=" + bezeichnung
				+ ", datum=" + datum + "]";
	}
	public int getNummer() {
		return nummer;
	}
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
}
