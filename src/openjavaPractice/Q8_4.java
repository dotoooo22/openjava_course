package openjavaPractice;

import java.awt.*;
import javax.swing.*;

public class Q8_4 extends JFrame {
	
	public Q8_4(){
		setTitle("Ten Color Button Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container=getContentPane();
		container.setLayout(new GridLayout(1,10));
		Color [] color= {Color.RED,Color.ORANGE,Color.GREEN,
				Color.CYAN,Color.BLUE,Color.MAGENTA,
				Color.GRAY,Color.DARK_GRAY,
				Color.PINK,Color.LIGHT_GRAY};
		
		for(int i=0;i<10;i++) {
			JButton button=new JButton(Integer.toString(i));
			button.setOpaque(true);
			button.setBackground(color[i]);
			container.add(button);
					
		}
			
		
		setSize(500,200);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new Q8_4();
	}

}