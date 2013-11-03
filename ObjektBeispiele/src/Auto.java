import java.awt.*;
public class Auto {
	private String typ;
	private Color farbe;
	private int position;
	private int tank;
	public Auto(String typ, Color farbe) {
		super();
		this.typ = typ;
		this.farbe = farbe;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public int getTank() {
		return tank;
	}
	public void setTank(int tank) {
		this.tank = tank;
	}
	public String getTyp() {
		return typ;
	}
	public Color getFarbe() {
		return farbe;
	}
	@Override
	public String toString() {
		return "Auto [typ=" + typ + ", farbe=" + farbe + ", position="
				+ position + ", tank=" + tank + "]";
	}
	public static void main(String[]args){
		Auto ferrari = new Auto("Ferrari", Color.RED);
		ferrari.setPosition(120);
		ferrari.setTank(13);
		System.out.println(ferrari);
	}
}
