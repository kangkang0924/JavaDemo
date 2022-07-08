package com.bbm.view;
import javax.swing.*;
import java.awt.*;
public class Login extends JFrame{
	public Login(){
		//创建顶层容器
		setSize(260,140);
		setTitle("图书借阅登陆界面");
		
		//创建中间容器
		JPanel usermaneJPanel = new JPanel();
		//创建标签组件
		Label usermaneLabel = new Label("用户名");//创建用户名面板
		//创建用户名文本框
		JTextField usemaneJTF =new JTextField(10);
		//把基本组件放到中间容器
		usermaneJPanel.add(usermaneLabel);
		usermaneJPanel.add(usemaneJTF);
		
		//创建密码面板
		JPanel pwdJPanel = new JPanel();
	
		Label pwdJLabel = new Label("密 码");	//创建用户名面板
		
		JTextField usepwdJTF =new JTextField(10);
		pwdJPanel.add(pwdJLabel);
		pwdJPanel.add(usepwdJTF);
		//按钮面板
		  //实例化中间容器
		  JPanel butJPanel = new JPanel();
		  //实例化基本组件
		  JButton butJLabel1 = new JButton("登录");
		  JButton butJLabel2 = new JButton("重置");
		  //把基本组件放到中间容器
		  butJPanel.add(butJLabel1);
		  butJPanel.add(butJLabel2);
		  //把中间容器放到顶层容器
		this.add(usermaneJPanel,BorderLayout.NORTH);
		this.add(pwdJPanel,BorderLayout.CENTER);
		this.add(butJPanel,BorderLayout.SOUTH);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				new Login();
	}

}
