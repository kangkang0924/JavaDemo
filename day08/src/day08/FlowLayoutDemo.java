package day08;
import javax.swing.*;

import java.awt.*;
public class FlowLayoutDemo extends JFrame{
	public FlowLayoutDemo (){
		  setSize(400,300);
		  setTitle("流式布局");
		  JPanel jpanel = new JPanel();
		  JButton jbt1 =new JButton("按钮1");
		  JButton jbt2 =new JButton("按钮2");
		  JButton jbt3 =new JButton("按钮3");
		  jpanel.add(jbt1);
		  jpanel.add(jbt2);
		  jpanel.add(jbt3);
		  this.add(jpanel);
		  setVisible(true);
	}
	 public static void main(String[] args) {
		  // TODO Auto-generated method stub
		 new FlowLayoutDemo();
		 }
}
