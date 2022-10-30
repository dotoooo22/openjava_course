package openjavaPractice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Q8_open extends JFrame{
   Q8_open(){
      setTitle("Open Challenge "); 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container c = getContentPane();
      c.setLayout(new BorderLayout()); 
      c.add(new NorthPanel(),BorderLayout.NORTH); 
      c.add(new CenterPanel(),BorderLayout.CENTER); 
      setSize(300,300);
      setVisible(true);
      
   }
   public static void main(String[] args) {
      new Q8_open();
   }
   
}
class NorthPanel extends JPanel{ // NORTH에 붙일 패널
   NorthPanel(){
      setBackground(Color.LIGHT_GRAY);
      this.add(new JButton("Open"));
      this.add(new JButton("Read"));
      this.add(new JButton("Close"));
   }
}
class CenterPanel extends JPanel{ // CENTER에 붙일 패널
   CenterPanel(){
      this.setLayout(null);
      String text[] = {"Hello", "Java", "Love"};
      int x;
      int y;
      JLabel label;
      for(int i=0;i<3;i++) {
         x = (int)(Math.random()*250); // 글자 짤림 방지를 위해 50의 여유를 남김
         y = (int)(Math.random()*250);
         label = new JLabel(text[i]);
         label.setLocation(x, y); // 랜덤위치에 label 붙이기
         label.setSize(50,10); // label 크기 설정
         this.add(label);
      }
   }
}