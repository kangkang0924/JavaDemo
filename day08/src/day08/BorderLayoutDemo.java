package day08;
import javax.swing.*;

import java.awt.*;
public class BorderLayoutDemo extends JFrame{
	public BorderLayoutDemo (){
		 setSize(300,200);
		  setTitle("��ʽ����");
		 
		  JButton jbt1 =new JButton("��ť1");
		  JButton jbt2 =new JButton("��ť2");
		  JButton jbt3 =new JButton("��ť3");
		  this.add(jbt1,BorderLayout.NORTH);
		  this.add(jbt2,BorderLayout.CENTER);
		  this.add(jbt3,BorderLayout.SOUTH);
		
		  setVisible(true);
	}
	public static void main(String[] args) {
		  // TODO Auto-generated method stub
		 new BorderLayoutDemo();
		 }
}
