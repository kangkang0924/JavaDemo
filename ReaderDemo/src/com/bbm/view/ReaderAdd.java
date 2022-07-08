package com.bbm.view;

import javax.swing.*;

import java.util.List;

import com.bbm.db.ReaderDao;
import com.bbm.model.Reader;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReaderAdd extends JFrame{
	JPanel tableJP,readerAddJP,buttonJP,genderJP,JP1,JP2,JP3,JP4,JP5,select_conditionJP;
	JLabel IDJL,nameJL,typeJL,genderJL,majorJL,phoneJL,deptJL,regJL;
	JTable jtable;
	
	JScrollPane jscrollpane;
	JTextField IDJTF,nameJTF,majorJTF,phoneJTF,deptJTF,regJTF,select_conditionJTF;
	JButton button1,button2,button3,setlectJB;
	JComboBox typeJCB,conditiongJCB,readertypeJCB,select_conditionJCB;
	JRadioButton manJRB,womanJRB;
	
	String[] readersearch={"编号","姓名","性别","年龄"};
	//String[] readersearch={"编号","类型","姓名","专业","性别","电话","系部","注册日期"};
	Object[][] getSelect(List<Reader> list){
        Object[][] results = new Object[list.size()][readersearch.length];
        for (int i = 0; i < list.size(); i++) {
            Reader reader = list.get(i);           
            results[i][0] = reader.getRid();            
            results[i][1] = reader.getRname();
            results[i][2] = reader.getRsex();
            results[i][3] = reader.getAge();       
        }
        return results;
    }
	public ReaderAdd(){
	  setSize(500,400);
	  setTitle("读者信息添加");
	  //第一部分，读者信息添加面板
	  JP2 = new JPanel();
	  readerAddJP = new JPanel();
	  JP2.setLayout(new GridLayout(2,4));
	  
	  select_conditionJP = new JPanel();
	  select_conditionJCB = new JComboBox();
	  String[] array={"读者编号","读者姓名","性别","年龄"};
	  for(int i=1;i<array.length;i++){
		  select_conditionJCB.addItem(array[i]);
	  }
	  select_conditionJP.add(select_conditionJCB);
	  select_conditionJTF = new JTextField();
	  select_conditionJTF.setColumns(20);
	  select_conditionJP.add(select_conditionJTF);
	  setlectJB =new JButton("查询");
	  select_conditionJP.add(setlectJB);
	  JP5 = new JPanel();
	 
	  //Object[][] cellData={{"11301121","学生","金信","计算机","男","18632159876","信息","2021-1-11"}};
		
	  jscrollpane = new JScrollPane();
	  jscrollpane.setPreferredSize(new Dimension(400,100));
	  Object[][] results=getSelect(ReaderDao.selectReader());
	  jtable = new JTable(results,readersearch);
	  //jtable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	  jscrollpane.setViewportView(jtable);
	  JP5.add(jscrollpane);
	  tableJP = new JPanel(new BorderLayout());
	  tableJP.add(select_conditionJP,BorderLayout.NORTH);
	  tableJP.add(JP5,BorderLayout.CENTER);
	  //网格第一行
	  IDJL=new JLabel("读者编号：");
	  IDJTF=new JTextField(10);
	  nameJL=new JLabel("姓名：");
	  nameJTF=new JTextField(10);
	  
	  
	  JP2.add(IDJL);
	  JP2.add(IDJTF);
	  JP2.add(nameJL);
	  JP2.add(nameJTF);
	  //网格第二行
//	  typeJL=new JLabel("类型：");
//	  typeJCB=new JComboBox();
//	  typeJCB.addItem("学生");
//	  typeJCB.addItem("教师");
	  
//	  genderJL = new JLabel("性别：");
//	  manJRB = new JRadioButton("男");
//	  womanJRB = new JRadioButton("女");
//	  ButtonGroup buttongroup = new ButtonGroup();
//	  buttongroup.add(manJRB);
//	  buttongroup.add(womanJRB);
//	  genderJP= new JPanel();
//	  genderJP.add(manJRB);
//	  genderJP.add(womanJRB);
	  
//	  JP2.add(typeJL);
//	  JP2.add(typeJCB);
//	  JP2.add(genderJL);
//	  JP2.add(genderJP);
//	  //
//	  majorJL=new JLabel("专业");
//	  majorJTF=new JTextField(10);
//	  phoneJL=new JLabel("电话：");
//	  phoneJTF=new JTextField(10);

//	  JP2.add(majorJL);
//	  JP2.add(majorJTF);
//	  JP2.add(phoneJL);
//	  JP2.add(phoneJTF);
	  
	  deptJL=new JLabel("性别");
	  deptJTF=new JTextField(10);
	  regJL=new JLabel("年龄：");
	  regJTF=new JTextField(10);
	  
	  JP2.add(deptJL);
	  JP2.add(deptJTF);
	  JP2.add(regJL);
	  JP2.add(regJTF);
	  
	   
	  button1=new JButton("修改");
	  button2=new JButton("关闭");
	  button3=new JButton("插入");
	  button3.addActionListener(new ActionEventHandler());
	  button1.addActionListener(new SelectActionListener());
	  JP3 = new JPanel();
	  JP3.add(button1);
	  JP3.add(button2);
	  JP3.add(button3);
	  
	  
	  this.add(tableJP,BorderLayout.NORTH);
	  this.add(JP2,BorderLayout.CENTER);
	  this.add(JP3,BorderLayout.SOUTH);
	  
	  setVisible(true);
	}
	class SelectActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String rid=IDJTF.getText().trim();
			String rname=nameJTF.getText().trim();
			String rsex=deptJTF.getText().trim();
			String age=regJTF.getText().trim();
			int j=ReaderDao.updateReader(rid, rname, rsex, Integer.parseInt(age));
			if(j==1){
				JOptionPane.showMessageDialog(null, "修改成功");
				Object[][] results=getSelect(ReaderDao.selectReader());
				jtable=new JTable(results,readersearch);
				jscrollpane.setViewportView(jtable);
			}
		}
		
	}
	class ActionEventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//获取读者文本框中的信息
			String rid=IDJTF.getText().trim();
			String rname=nameJTF.getText().trim();
			String rsex=deptJTF.getText().trim();
			String age=regJTF.getText().trim();
			//调用ReaderDao中的插入数据库的方法
			int i=ReaderDao.insertReader(rid, rname, rsex, Integer.parseInt(age));
			if(i==1){
				JOptionPane.showMessageDialog(null, "插入成功");
				//重新查询数据库，给jtable重新绑定数据源
				Object[][] results=getSelect(ReaderDao.selectReader());
				jtable=new JTable(results,readersearch);
				jscrollpane.setViewportView(jtable);
			} 
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new ReaderAdd();
	}

}
