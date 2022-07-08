package day08;
import javax.swing.*;

import java.awt.*;
public class BorderLayoutDemo extends JFrame{
	public BorderLayoutDemo (){
		 setSize(300,200);
		  setTitle("流式布局");
		 
		  JButton jbt1 =new JButton("按钮1");
		  JButton jbt2 =new JButton("按钮2");
		  JButton jbt3 =new JButton("按钮3");
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
