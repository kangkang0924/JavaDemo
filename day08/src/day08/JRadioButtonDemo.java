package day08;
import java.awt.*;

import javax.swing.*;


public class JRadioButtonDemo extends JFrame{
 public JRadioButtonDemo(){
  setSize(300,150);
  setTitle("JRadioButton");
  //�����м�����
  JPanel genderJPanel = new JPanel();
  
  //�����������
//  JLabel jlabel = new JLabel();
  Label usermaneLabel = new Label("�Ա�:");
  JRadioButton manJRB = new JRadioButton("��");
  JRadioButton womanJRB = new JRadioButton("Ů");
  
  //�ѻ�������ŵ��м�����
//  genderJPanel.add(jlabel);
  genderJPanel.add(usermaneLabel);
  genderJPanel.add(manJRB);
  genderJPanel.add(womanJRB);
  
  //ʵ����ButtonGroup�������������
  ButtonGroup buttongroup = new ButtonGroup();
  buttongroup.add(manJRB);
  buttongroup.add(womanJRB);
  
  //���м������ŵ���������
  this.add(genderJPanel);
  setVisible(true);
  
 }
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  new JRadioButtonDemo();
 }

}


