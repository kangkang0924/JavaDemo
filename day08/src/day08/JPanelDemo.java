package day08;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
public class JPanelDemo extends JFrame{
	
		public JPanelDemo(){
			//1.������������
			setSize(300,200);
			setTitle("ͼ�����");
		
			 JPanel jpanel= new JPanel();
				//�����м�����JPanel
			 TitledBorder tb =new TitledBorder("���߽�����Ϣ");
			 jpanel.setBorder(tb);
			 
			 //3.���м��������붥������
			 this.add(jpanel);
			setVisible(true);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new JPanelDemo();
	}
}
