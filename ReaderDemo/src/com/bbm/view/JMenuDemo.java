package com.bbm.view;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
public class JMenuDemo extends JFrame{
		public JMenuDemo(){
			setSize(400,300);
			  setTitle("图示借阅");
			  //创建菜单栏
			  JMenuBar jmenuBar =new JMenuBar();
			  //把菜单栏放入顶层容器
			  setJMenuBar(jmenuBar);
			  //创建菜单
			  JMenu jmenu = new JMenu("读者信息管理");
			  jmenuBar.add(jmenu);
			  //创建菜单项
			  JMenuItem jmenuItem1 = new JMenuItem("读者信息添加");
			  JMenuItem jmenuItem2 = new JMenuItem("读者信息查询与修改");
			  jmenuItem2.addActionListener(new ActionListenerHandler());
			 
			  
			  jmenu.add(jmenuItem1);
			  jmenu.add(jmenuItem2);
			  
			  JMenu jmenu2 = new JMenu("图书信息管理");
			  jmenuBar.add(jmenu2);
			  JMenuItem jmenuItem3 = new JMenuItem("图书信息添加");
			  JMenuItem jmenuItem4 = new JMenuItem("图书信息查询与修改");
			  jmenu2.add(jmenuItem3);
			  jmenu2.add(jmenuItem4);
			  
			  JMenu jmenu3 = new JMenu("图书借阅管理");
			  jmenuBar.add(jmenu3);
			  JMenuItem jmenuItem5 = new JMenuItem("图书借阅");
			  JMenuItem jmenuItem6 = new JMenuItem("图书归还");
			  jmenu3.add(jmenuItem5);
			  jmenu3.add(jmenuItem6);
			  
			  JMenu jmenu4 = new JMenu("基础信息维护");
			  jmenuBar.add(jmenu4);
			  JMenuItem jmenuItem7 = new JMenuItem("读者类型设置");
			  JMenuItem jmenuItem8 = new JMenuItem("图书类别设置");
			  JMenuItem jmenuItem9 = new JMenuItem("罚金设置");
			  jmenu4.add(jmenuItem7);
			  jmenu4.add(jmenuItem8);
			  jmenu4.add(jmenuItem9);
			  
			  JMenu jmenu5 = new JMenu("用户管理");
			  jmenuBar.add(jmenu5);
			  JMenuItem jmenuItem10 = new JMenuItem("修改密码");
			  JMenuItem jmenuItem11 = new JMenuItem("用户添加");
			  JMenuItem jmenuItem12 = new JMenuItem("用户删除");
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
