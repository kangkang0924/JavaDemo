package day08;
import java.awt.*;

import javax.swing.*;
public class GridLayoutDemo extends JFrame{
	JButton jbt1,jbt2,jbt3,jbt4;
	public GridLayoutDemo(){
		  setSize(300,300);
		  setTitle("��ť");
		  //setLayout(new GridLayout(3,2));
		  
		  JPanel jpanel = new JPanel();
		  //�޸�jpanel�Ĳ��ַ�ʽΪ���񲼾�
		  jpanel.setLayout(new GridLayout(2,2));
		  
		   jbt1 =new JButton("��ť1");
		   jbt2 =new JButton("��ť2");
		   jbt3 =new JButton("��ť3");
		  // jbt4 =new JButton("��ť4");
		   
		  jpanel.add(jbt1);
		  jpanel.add(jbt2);
		  jpanel.add(jbt3);
		  jpanel.add(jbt4);
		  this.add(jpanel);
		  setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutDemo();
	}

}
