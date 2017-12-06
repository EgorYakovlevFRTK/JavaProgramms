import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
	private static ArrayList<Profile> profiles = new ArrayList<Profile>();
	
	public static void main(String[] args) {
		profiles = (ArrayList<Profile>) deserData("profiles");
		System.out.println(profiles.size());
		Profile profile = new Profile();
		profile.setName(JOptionPane.showInputDialog(null, "Enter your name"));
		profile.setSurname(JOptionPane.showInputDialog(null, "Enter your surname"));
		profiles.add(profile);
		
		for (Profile p : profiles) {
			System.out.println(p.getName() + " " + p.getSurname());
		}
		
		System.out.println(profiles.size());
		serData("profiles", profiles);
	}

	private static void serData(String filename, Object obj) {
		try {
			FileOutputStream fileout = new FileOutputStream(filename + ".ser");
			try {
				ObjectOutputStream out = new ObjectOutputStream(fileout);
				out.writeObject(obj);
				fileout.close();
				out.close();
			} catch (IOException e) {
				System.out.println("������ �����/������");
				System.exit(2);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception");
			System.exit(1);
		}
	
	}

	private static Object deserData(String filename) {
		Object retObject = null;
		try {
			FileInputStream filein = new FileInputStream(filename + ".ser");
			try {
				ObjectInputStream in = new ObjectInputStream(filein);
				try {
					retObject = in.readObject();
				} catch (ClassNotFoundException e) {
					System.out.println("����� �� ������");
					System.exit(3);
				}
				filein.close();
				in.close();
			} catch (IOException e) {
				System.out.println("������ �����/������");
				System.exit(2);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception");
			System.exit(1);
		}	
		return retObject;
	}
	
}
