
public class Angestellter {
	private String name;
	private int gehalt;
	private Angestellter chef;
	public Angestellter(String name, int gehalt) {
		super();
		this.name = name;
		this.gehalt = gehalt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGehalt() {
		return gehalt;
	}
	public void setGehalt(int gehalt) {
		this.gehalt = gehalt;
	}
	public void setChef(Angestellter chef){
		this.chef = chef;
	}
	@Override
	public String toString() {
		return "Angestellter [name=" + name + ", gehalt=" + gehalt + ", chef="
				+ chef + "]";
	}
	public static void main(String[] args){
		Angestellter anna = new Angestellter("Anna Alpha", 80000);
		Angestellter berta = new Angestellter("Berta Baier", 60000);
		berta.setChef(anna);
		System.out.println(anna);
		System.out.println(berta);
	}
	
}
