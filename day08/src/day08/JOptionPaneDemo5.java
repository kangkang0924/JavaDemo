package day08;

import javax.swing.*;
import java.awt.*;

public class JOptionPaneDemo5 extends JFrame {
    public JOptionPaneDemo5(){
     Object[] possibleValues={"����","�Ϻ�","����"};
     Object selectedValue=JOptionPane.showInputDialog(null,"���˾ӳ���","ѡ�������",JOptionPane.INFORMATION_MESSAGE,null,possibleValues,possibleValues[0]);
     System.out.println("��ѡ����"+(String)selectedValue+"��Ŀ");
    }
  
 public static void main(String[] args) {
  // TODO Auto-generated method stub
    new JOptionPaneDemo5();
 }

}