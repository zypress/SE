import static org.junit.Assert.*;
import org.junit.*;


public class GeraeteListeTest {
	GeraeteListe geraeteListe;
	@Before
	public void initialize(){
		geraeteListe = new GeraeteListe();
	}
	@Test
	public void leereListe(){
		assertEquals(0, geraeteListe.getAnzahlGeraete());
	}
	@Test
	public void hinzufuegen(){
		geraeteListe.hinzufuegen(new Geraet("Nexus 7"));
		geraeteListe.hinzufuegen(new Geraet("iPad Air"));
		geraeteListe.hinzufuegen(new Geraet("Galaxy"));
		assertEquals(3, geraeteListe.getAnzahlGeraete());
	}
	@Test
	public void entfernen(){
		Geraet geraet1 = new Geraet("Nexus 7");
		Geraet geraet2 = new Geraet("iPad Air");
		geraeteListe.hinzufuegen(geraet1);
		geraeteListe.hinzufuegen(geraet2);
		geraeteListe.entfernen(geraet1);
		assertEquals(1, geraeteListe.getAnzahlGeraete());
	}
	@Test
	public void finden(){
		Geraet geraet1 = new Geraet("Nexus 7");
		Geraet geraet2 = new Geraet("iPad Air");
		geraeteListe.hinzufuegen(geraet1);
		geraeteListe.hinzufuegen(geraet2);
		Geraet result = geraeteListe.finden("NEXUS 7");
		assertEquals(geraet1, result);
	}
	@Test (expected = NoGeraetFoundException.class)
	public void nichtGefunden(){
		Geraet geraet1 = new Geraet("Nexus 7");
		Geraet geraet2 = new Geraet("iPad Air");
		geraeteListe.hinzufuegen(geraet1);
		geraeteListe.hinzufuegen(geraet2);
		Geraet result = geraeteListe.finden("Galaxy");
	}
}
