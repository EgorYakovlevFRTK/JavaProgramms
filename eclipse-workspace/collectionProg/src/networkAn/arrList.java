package networkAn;

import java.util.ArrayList;
import java.util.Random;

public class arrList {
	
	public static ArrayList<mobile> mobiles;
	private static Random r = new Random();
	
	public arrList () {
		 
		this.mobiles = new ArrayList<mobile>();
		this.addNumber();
		this.showMobiles();
	}
	public void addNumber() {
		for (int i = 0; i < 300; i++) {
			mobiles.add(new mobile(r.nextInt(9999999), "Egor loves pomidors"));
		}
	}
	
	public void showMobiles() {
		for (mobile m: mobiles) {
			System.out.println(m.getNumber() + " " + m.getName());
		}
	}
}
