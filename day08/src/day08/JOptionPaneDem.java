package day08;
import javax.swing.*;

import java.awt.*;
public class JOptionPaneDem extends JFrame{
 public JOptionPaneDem(){
  JOptionPane.showMessageDialog(null,"���߱�Ų�����Ϊ��");
  
  JOptionPane.showConfirmDialog(null, "ȷ����", "ȷ�϶Ի���",JOptionPane.YES_NO_OPTION );
  Object[] options = {"Java","C","C#"};
  int response = JOptionPane.showOptionDialog(this, "��ѡ����ϲ��������", "ѡ��Ի���", JOptionPane.YES_OPTION,JOptionPane.QUESTION_MESSAGE, null, options,options[0]);
  if(response==0)
  {JOptionPane.showConfirmDialog(null, "��ϲ��java���ԣ�ȷ����","ȷ�϶Ի���", JOptionPane.YES_NO_OPTION);}
  else if(response==1)
  {JOptionPane.showConfirmDialog(null, "��ϲ��C���ԣ�ȷ����","ȷ�϶Ի���", JOptionPane.YES_NO_OPTION);}
  else if(response==2)
  {JOptionPane.showConfirmDialog(null, "��ϲ��C#���ԣ�ȷ����","ȷ�϶Ի���", JOptionPane.YES_NO_OPTION);}
  
  String inputValue = JOptionPane.showInputDialog("�����룺");
  Object[] possibleValues = {"����","�Ϻ�","����"};
  
  Object selectedValue = JOptionPane.showInputDialog(null, "���˾ӳ���", "ѡ������Ի���", JOptionPane.INFORMATION_MESSAGE, null,possibleValues, possibleValues[0]);
  System.out.println("��ѡ����"+(String)selectedValue+"��Ŀ");

 }
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  new JOptionPaneDem();
  
 }

}