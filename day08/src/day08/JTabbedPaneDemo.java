package day08;
import javax.swing.*;

import java.awt.*;

public class JTabbedPaneDemo extends JFrame{
	public JTabbedPaneDemo(){
		//1.������������	
		setSize(300,200);
		setTitle("JScrollpane");
		//2.ʵ����JScrollpane����
		JTabbedPane jtabbedpane =new JTabbedPane();
		JPanel jpanel1 = new JPanel();
		JPanel jpanel2 = new JPanel();
		jtabbedpane.addTab("ͼ����Ϣ��ѯ", jpanel1);
		jtabbedpane.addTab("ͼ����Ϣ�޸�", jpanel2);
		//���м��������붥������
		this.add(jtabbedpane);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTabbedPaneDemo();
	}

}
