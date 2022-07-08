package day08;

import javax.swing.*;
import java.awt.*;

public class JOptionPaneDemo3 extends JFrame{
    public JOptionPaneDemo3(){
     Object[] options={"Java","C","C#"};
     int response=JOptionPane.showOptionDialog(this,"请选择你喜欢的语言","选项对话框",JOptionPane.YES_OPTION,JOptionPane.YES_OPTION,null,options,options[0]);
     if(response==0)
     {
      JOptionPane.showConfirmDialog(null, "你喜欢Java语言，确定吗？","确认对话框",JOptionPane.YES_NO_OPTION);
     }
     else if(response==1)
     {
      JOptionPane.showConfirmDialog(null, "你喜欢C语言，确定吗？","确认对话框",JOptionPane.YES_NO_OPTION);
     }
     else if(response==2)
     {
      JOptionPane.showConfirmDialog(null, "你喜欢C#语言，确定吗？","确认对话框",JOptionPane.YES_NO_OPTION);
     }
    }
 public static void main(String[] args) {
  // TODO Auto-generated method stub
    new JOptionPaneDemo3();
 }

}