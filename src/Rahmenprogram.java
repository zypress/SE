import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;


public class Rahmenprogram {
	private String bezeichnung;
	private String ort;
	private Date datum;
	private Time zeit;
	public ArrayList<Teilnehmer> teilnehmerList;
	
	public Rahmenprogram(String bezeichnung, String ort, Date datum, Time zeit) {
		super();
		this.bezeichnung = bezeichnung;
		this.ort = ort;
		this.datum = datum;
		this.zeit = zeit;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	public Time getZeit() {
		return zeit;
	}
	public void setZeit(Time zeit) {
		this.zeit = zeit;
	}
}
