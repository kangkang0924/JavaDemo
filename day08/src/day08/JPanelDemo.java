package day08;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
public class JPanelDemo extends JFrame{
	
		public JPanelDemo(){
			//1.创建顶层容器
			setSize(300,200);
			setTitle("图书借阅");
		
			 JPanel jpanel= new JPanel();
				//创建中间容器JPanel
			 TitledBorder tb =new TitledBorder("读者借阅信息");
			 jpanel.setBorder(tb);
			 
			 //3.把中间容器放入顶层容器
			 this.add(jpanel);
			setVisible(true);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new JPanelDemo();
	}
}
