package com.bbm.view;
import java.awt.*;

import javax.swing.*;
import javax.swing.text.GapContent;
public class ReaderAdd extends JFrame{
	JPanel tableJP,readerAddJP,buttonJP,genderJP;
	JLabel IDJL,nameJL,typeJL,genderJL,majorJL,phoneJL,deptJL,regJL;
	JTextField IDJTF,nameJTF,majorJTF,phoneJTF,deptJTF,regJTF;
	JComboBox typeJCB;
	JRadioButton manJRB,womanJRB;
	public ReaderAdd(){
	  setSize(400,400);
	  setTitle("������Ϣ���");
	  //��һ���֣�������Ϣ������
	  readerAddJP = new JPanel();
	  readerAddJP.setLayout(new GridLayout(4,4));
	  //�����һ��
	  IDJL=new JLabel("���߱�ţ�");
	  IDJTF=new JTextField(10);
	  nameJL=new JLabel("���߱�ţ�");
	  nameJTF=new JTextField(10);
	  
	  readerAddJP.add(IDJL);
	  readerAddJP.add(IDJTF);
	  readerAddJP.add(nameJL);
	  readerAddJP.add(nameJTF);
	  //����ڶ���
	  typeJL=new JLabel("���ͣ�");
	  typeJCB=new JComboBox();
	  typeJCB.addItem("ѧ��");
	  typeJCB.addItem("��ʦ");
	  
	  genderJL = new JLabel("�Ա�");
	  manJRB = new JRadioButton("��");
	  womanJRB = new JRadioButton("Ů");
	  ButtonGroup buttongroup = new ButtonGroup();
	  buttongroup.add(manJRB);
	  buttongroup.add(womanJRB);
	  genderJP= new JPanel();
	  genderJP.add(manJRB);
	  genderJP.add(womanJRB);
	  
	  readerAddJP.add(typeJL);
	  readerAddJP.add(typeJCB);
	  readerAddJP.add(genderJL);
	  readerAddJP.add(genderJP);
	  //
	  majorJL=new JLabel("רҵ");
	  majorJTF=new JTextField(10);
	  phoneJL=new JLabel("�绰��");
	  phoneJTF=new JTextField(10);
	  
	  readerAddJP.add(majorJL);
	  readerAddJP.add(majorJTF);
	  readerAddJP.add(phoneJL);
	  readerAddJP.add(phoneJTF);
	  
	  deptJL=new JLabel("ϵ��");
	  deptJTF=new JTextField(10);
	  regJL=new JLabel("ע�����ڣ�");
	  regJTF=new JTextField(10);
	  
	  readerAddJP.add(deptJL);
	  readerAddJP.add(deptJTF);
	  readerAddJP.add(regJL);
	  readerAddJP.add(regJTF);
	  this.add(readerAddJP);
	  
	  setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new ReaderAdd();
	}

}
