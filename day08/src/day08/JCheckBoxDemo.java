package day08;


import java.awt.*;

import javax.swing.*;
public class JCheckBoxDemo extends JFrame{
	public JCheckBoxDemo(){
		setSize(500,150);
		setTitle("JCheckBox");
		//�����м�����
				JPanel JcBJPanel1 = new JPanel();
				JPanel JcBJPanel2 = new JPanel();
				
		//�����������		
				Label usermaneLabel = new Label("��ѡ��������ĸ�λ�͹���");
				JCheckBox jCheckBox1 = new JCheckBox("�������ʦ");
				JCheckBox jCheckBox2 = new JCheckBox("�������ʦ");
				JCheckBox jCheckBox3 = new JCheckBox("3000");
				JCheckBox jCheckBox4 = new JCheckBox("5000");
				
		//�ѻ�������ŵ��м�����		
				JcBJPanel1.add(usermaneLabel);
				JcBJPanel2.add(jCheckBox1);
				JcBJPanel2.add(jCheckBox2);
				JcBJPanel2.add(jCheckBox3);
				JcBJPanel2.add(jCheckBox4);
				
		//���м������ŵ�����������		
				this.add(JcBJPanel1,BorderLayout.NORTH);
				this.add(JcBJPanel2,BorderLayout.CENTER);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				new JCheckBoxDemo();
	}

}