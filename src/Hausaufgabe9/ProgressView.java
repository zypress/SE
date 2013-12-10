package Hausaufgabe9;

import java.util.*;
import javax.swing.*;

public class ProgressView implements Observer {
	private Engine engine;
	JProgressBar balken = new JProgressBar(0, 100);


	public void progressBar() {
		JFrame frame = new JFrame();
		frame.setSize(300, 100);
		frame.setTitle("Engine");
		JPanel panel = new JPanel();
		panel.add(balken);
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void update(Observable obs, Object obj) {
		int wert = (Integer) obj;
		// Wert für Ladebalken setzen
		balken.setValue(wert);
		// aktueller Wert wird als Text angezeigt
		balken.setStringPainted(true);
	}

}
