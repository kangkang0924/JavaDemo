package com.bbm.view;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
public class JMenuDemo extends JFrame{
		public JMenuDemo(){
			setSize(400,300);
			  setTitle("ͼʾ����");
			  //�����˵���
			  JMenuBar jmenuBar =new JMenuBar();
			  //�Ѳ˵������붥������
			  setJMenuBar(jmenuBar);
			  //�����˵�
			  JMenu jmenu = new JMenu("������Ϣ����");
			  jmenuBar.add(jmenu);
			  //�����˵���
			  JMenuItem jmenuItem1 = new JMenuItem("������Ϣ���");
			  JMenuItem jmenuItem2 = new JMenuItem("������Ϣ��ѯ���޸�");
			  jmenuItem2.addActionListener(new ActionListenerHandler());
			 
			  
			  jmenu.add(jmenuItem1);
			  jmenu.add(jmenuItem2);
			  
			  JMenu jmenu2 = new JMenu("ͼ����Ϣ����");
			  jmenuBar.add(jmenu2);
			  JMenuItem jmenuItem3 = new JMenuItem("ͼ����Ϣ���");
			  JMenuItem jmenuItem4 = new JMenuItem("ͼ����Ϣ��ѯ���޸�");
			  jmenu2.add(jmenuItem3);
			  jmenu2.add(jmenuItem4);
			  
			  JMenu jmenu3 = new JMenu("ͼ����Ĺ���");
			  jmenuBar.add(jmenu3);
			  JMenuItem jmenuItem5 = new JMenuItem("ͼ�����");
			  JMenuItem jmenuItem6 = new JMenuItem("ͼ��黹");
			  jmenu3.add(jmenuItem5);
			  jmenu3.add(jmenuItem6);
			  
			  JMenu jmenu4 = new JMenu("������Ϣά��");
			  jmenuBar.add(jmenu4);
			  JMenuItem jmenuItem7 = new JMenuItem("������������");
			  JMenuItem jmenuItem8 = new JMenuItem("ͼ���������");
			  JMenuItem jmenuItem9 = new JMenuItem("��������");
			  jmenu4.add(jmenuItem7);
			  jmenu4.add(jmenuItem8);
			  jmenu4.add(jmenuItem9);
			  
			  JMenu jmenu5 = new JMenu("�û�����");
			  jmenuBar.add(jmenu5);
			  JMenuItem jmenuItem10 = new JMenuItem("�޸�����");
			  JMenuItem jmenuItem11 = new JMenuItem("�û����");
			  JMenuItem jmenuItem12 = new JMenuItem("�û�ɾ��");
			  jmenu5.add(jmenuItem10);
			  jmenu5.add(jmenuItem11);
			  jmenu5.add(jmenuItem12);
			  
			  
			  setVisible(true);
		}
		class ActionListenerHandler implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new ReaderAdd();				
				}
			
		}
		 public static void main(String[] args) {
			  // TODO Auto-generated method stub
			  new JMenuDemo();
			 }
			
}
