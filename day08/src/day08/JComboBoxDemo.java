package day08;

import java.awt.BorderLayout;
import java.awt.Label;

import javax.swing.*;

public class JComboBoxDemo extends JFrame{
	public JComboBoxDemo(){
		setSize(300,150);
		setTitle("JComboBox");
		
		JPanel JcBJPanel = new JPanel();
		JPanel JcBJPanel2 = new JPanel();
		
		Label usermaneLabel = new Label("��������");
		JComboBox jcomboBox1 = new JComboBox();
		jcomboBox1.addItem("ѧ��");
		jcomboBox1.addItem("��ʦ");
		
		JcBJPanel.add(usermaneLabel);
		JcBJPanel2.add(jcomboBox1);
		setVisible(true);
		
		this.add(JcBJPanel,BorderLayout.NORTH);
		this.add(JcBJPanel2,BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new JComboBoxDemo();
	}

}
