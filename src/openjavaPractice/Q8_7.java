package openjavaPractice;

import javax.swing.*;
import java.awt.*;

public class Q8_7 extends JFrame {
	
	public Q8_7() {
		super("3개의 패널을 가진 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container=getContentPane();
		container.setLayout(new BorderLayout());
		
		JPanel p1=new JPanel();
		p1.setBackground(Color.YELLOW);
		p1.setLayout(new FlowLayout());
		p1.add(new JButton("새로 배치"));
		p1.add(new JButton("종료"));

		container.add(p1,BorderLayout.NORTH);


		JPanel p2=new JPanel();
		p2.setLayout(null);
		
		for(int i=0;i<10;i++) {
			JLabel label=new JLabel("*"); 

			int x=(int)(Math.random()*200)+50;
			int y=(int)(Math.random()*150)+50;
			label.setForeground(Color.MAGENTA);
			label.setOpaque(true);
			label.setLocation(x, y);
			label.setSize(20,20);
			
			p2.add(label); 
		}
		container.add(p2,BorderLayout.CENTER); 
		JPanel p3=new JPanel();
		p3.setLayout(new FlowLayout()); 
		
		p3.add(new JButton("별 갯수 수정")); 
		p3.setBackground(Color.LIGHT_GRAY); 

		p3.add(new JTextField(15));
		container.add(p3,BorderLayout.SOUTH); 
		setSize(300,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Q8_7();
	}

}
