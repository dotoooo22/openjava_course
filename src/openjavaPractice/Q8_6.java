package openjavaPractice;

import javax.swing.*;
import java.awt.*;
public class Q8_6 extends JFrame{
	
	public Q8_6() {
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container=getContentPane();
		
		for(int i=0;i<19;i++) {
			JLabel label=new JLabel(Integer.toString(i));
			int x=(int)(Math.random()*220+30);
			int y=(int)(Math.random()*220+30);
			label.setSize(20,20);

			label.setLocation(x, y);
			label.setForeground(Color.MAGENTA);
			
			container.add(label);
		}
		
		setSize(300,300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Q8_6();
	}

}