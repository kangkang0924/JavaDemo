package day08;


import javax.swing.*;

import java.awt.*;
public class JTableDemo extends JFrame{
	String[] columnNames={"���","����","����","רҵ","�Ա�","�绰","ϵ��","ע������"};
	Object[][] cellData={{"11301121","ѧ��","����","�����","��","18632159876","��Ϣ","2021-1-11"}};
	public JTableDemo(){
		//������������
		setSize(400,300);
		  setTitle("ͼ�����");
		  JScrollPane jscrollpane = new JScrollPane();
		  JTable jtable = new JTable(cellData,columnNames);
		  jtable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		  jscrollpane.setViewportView(jtable);
		  this.add(jscrollpane);
		  setVisible(true);
	}
	 public static void main(String[] args) {
		  // TODO Auto-generated method stub
		 new JTableDemo();
		 }

}
