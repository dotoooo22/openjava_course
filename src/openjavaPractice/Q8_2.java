package openjavaPractice;

import javax.swing.*;
import java.awt.*;

public class Q8_2 extends JFrame{
	public Q8_2() {
		//프레임 타이틀
		setTitle("BorderLayout");
		//프레임 종료 기능
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//컨테인 팬 하나 받아오기
		Container contentPane=getContentPane();
		
		//컨탠트 팬에 배치 관리자 배정(hGap,vGap)
		contentPane.setLayout(new BorderLayout(50,5));
		//컨텐트 팬에 버튼 추가 & 배열
		contentPane.add(new JButton("North"),BorderLayout.NORTH);
		contentPane.add(new JButton("Center"),BorderLayout.CENTER);
		contentPane.add(new JButton("South"),BorderLayout.SOUTH);
		contentPane.add(new JButton("East"),BorderLayout.EAST);
		contentPane.add(new JButton("West"),BorderLayout.WEST);
		
		//프레임 사이즈
		setSize(400,200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Q8_2();
	}

}