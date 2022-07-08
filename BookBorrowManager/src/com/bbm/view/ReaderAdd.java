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
	  setTitle("读者信息添加");
	  //第一部分，读者信息添加面板
	  readerAddJP = new JPanel();
	  readerAddJP.setLayout(new GridLayout(4,4));
	  //网格第一行
	  IDJL=new JLabel("读者编号：");
	  IDJTF=new JTextField(10);
	  nameJL=new JLabel("读者编号：");
	  nameJTF=new JTextField(10);
	  
	  readerAddJP.add(IDJL);
	  readerAddJP.add(IDJTF);
	  readerAddJP.add(nameJL);
	  readerAddJP.add(nameJTF);
	  //网格第二行
	  typeJL=new JLabel("类型：");
	  typeJCB=new JComboBox();
	  typeJCB.addItem("学生");
	  typeJCB.addItem("教师");
	  
	  genderJL = new JLabel("性别：");
	  manJRB = new JRadioButton("男");
	  womanJRB = new JRadioButton("女");
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
	  majorJL=new JLabel("专业");
	  majorJTF=new JTextField(10);
	  phoneJL=new JLabel("电话：");
	  phoneJTF=new JTextField(10);
	  
	  readerAddJP.add(majorJL);
	  readerAddJP.add(majorJTF);
	  readerAddJP.add(phoneJL);
	  readerAddJP.add(phoneJTF);
	  
	  deptJL=new JLabel("系部");
	  deptJTF=new JTextField(10);
	  regJL=new JLabel("注册日期：");
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
