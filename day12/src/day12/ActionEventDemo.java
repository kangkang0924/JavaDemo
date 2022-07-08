package day12;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ActionEventDemo extends JFrame{
	ActionEventDemo(){
		setSize(200,100);
		JButton jbt = new JButton("µã»÷ÎÒ");
		this.add(jbt);
		jbt.addActionListener(new ActionListenerHandler());
		this.setVisible(true);
	}
	class ActionListenerHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Hello world");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ActionEventDemo();
	}

}
