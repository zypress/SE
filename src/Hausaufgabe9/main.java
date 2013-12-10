package Hausaufgabe9;

public class main {
	public static void main(String[] args) {
		Engine engine = new Engine();
		ProgressView view = new ProgressView();
		view.progressBar();
		engine.addObserver(view);
		engine.start();
	}
}
