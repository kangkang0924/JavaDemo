package com.bbm.view;
import javax.swing.*;
import java.awt.*;
public class Login extends JFrame{
	public Login(){
		//������������
		setSize(260,140);
		setTitle("ͼ����ĵ�½����");
		
		//�����м�����
		JPanel usermaneJPanel = new JPanel();
		//������ǩ���
		Label usermaneLabel = new Label("�û���");//�����û������
		//�����û����ı���
		JTextField usemaneJTF =new JTextField(10);
		//�ѻ�������ŵ��м�����
		usermaneJPanel.add(usermaneLabel);
		usermaneJPanel.add(usemaneJTF);
		
		//�����������
		JPanel pwdJPanel = new JPanel();
	
		Label pwdJLabel = new Label("�� ��");	//�����û������
		
		JTextField usepwdJTF =new JTextField(10);
		pwdJPanel.add(pwdJLabel);
		pwdJPanel.add(usepwdJTF);
		//��ť���
		  //ʵ�����м�����
		  JPanel butJPanel = new JPanel();
		  //ʵ�����������
		  JButton butJLabel1 = new JButton("��¼");
		  JButton butJLabel2 = new JButton("����");
		  //�ѻ�������ŵ��м�����
		  butJPanel.add(butJLabel1);
		  butJPanel.add(butJLabel2);
		  //���м������ŵ���������
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
