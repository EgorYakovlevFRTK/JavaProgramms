package threadProg;

public class Main {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Aider("1"));
		Thread t2 = new Thread(new Aider("2"));
		Thread t3 = new Thread(new Aider("3"));
		t1.start();
		t2.start();
		t3.start();
	}

}
