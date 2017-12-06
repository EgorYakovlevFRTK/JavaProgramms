package swingGuiProg;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window extends JFrame {
	private JTextField textField; //Наследуем JFrame: расширяем класс
	
	public Window () {
		
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
