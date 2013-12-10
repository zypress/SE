package Hausaufgabe9;

import java.util.Observable;

public class Engine extends Observable implements Runnable {
	ProgressView prog = new ProgressView();
	int progress;
	Thread thread = new Thread();

	@Override
	public void run() {
		thread.start();
		while (true) {
			try {
				Thread.sleep(100);
				progress++;
				if(getProgress()>=100){
					stop();
				}
				setChanged();
				notifyObservers(progress);
			} catch (InterruptedException e) {
			}
		}
	}

	public int getProgress() {
		return progress;
	}
	
	public void start() {
		run();
	}

	@SuppressWarnings("deprecation")
	public void stop() {
		thread.interrupt();
	}
}
