package day08;

import javax.swing.*;
import java.awt.*;

public class JOptionPaneDemo3 extends JFrame{
    public JOptionPaneDemo3(){
     Object[] options={"Java","C","C#"};
     int response=JOptionPane.showOptionDialog(this,"��ѡ����ϲ��������","ѡ��Ի���",JOptionPane.YES_OPTION,JOptionPane.YES_OPTION,null,options,options[0]);
     if(response==0)
     {
      JOptionPane.showConfirmDialog(null, "��ϲ��Java���ԣ�ȷ����","ȷ�϶Ի���",JOptionPane.YES_NO_OPTION);
     }
     else if(response==1)
     {
      JOptionPane.showConfirmDialog(null, "��ϲ��C���ԣ�ȷ����","ȷ�϶Ի���",JOptionPane.YES_NO_OPTION);
     }
     else if(response==2)
     {
      JOptionPane.showConfirmDialog(null, "��ϲ��C#���ԣ�ȷ����","ȷ�϶Ի���",JOptionPane.YES_NO_OPTION);
     }
    }
 public static void main(String[] args) {
  // TODO Auto-generated method stub
    new JOptionPaneDemo3();
 }

}