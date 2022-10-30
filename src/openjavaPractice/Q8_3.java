package openjavaPractice;

import javax.swing.*;
import java.awt.*;

public class Q8_3 extends JFrame {
	
	public Q8_3() {

		setTitle("FlowLayout");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container=getContentPane();
		
		container.setLayout(new FlowLayout());
		
		container.add(new JLabel("100+200"));
		container.add(new JButton("="));
		container.add(new JLabel("300"));
		
		setSize(400,100);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Q8_3();
	}
}