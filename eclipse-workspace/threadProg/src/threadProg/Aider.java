package threadProg;

import java.util.Random;

public class Aider implements Runnable {

	
	int time;
	String name;
	Random r = new Random();
	
	public Aider(String name) {
		
		this.name = name;
		time = r.nextInt(999);
		
	}
	
	
	@Override
	public void run() {
		
		System.out.printf("Поток %s спит %d\n", name, time);
		//Возможно прерывание потока: требует синтаксис языка
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			
		}
		System.out.printf("Поток %s проснулся\n", name);
	}

}
