package day08;


import javax.swing.*;

import java.awt.*;
public class JTableDemo extends JFrame{
	String[] columnNames={"编号","类型","姓名","专业","性别","电话","系部","注册日期"};
	Object[][] cellData={{"11301121","学生","金信","计算机","男","18632159876","信息","2021-1-11"}};
	public JTableDemo(){
		//创建顶层容器
		setSize(400,300);
		  setTitle("图书借阅");
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
