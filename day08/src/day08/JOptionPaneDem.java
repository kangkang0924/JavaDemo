package day08;
import javax.swing.*;

import java.awt.*;
public class JOptionPaneDem extends JFrame{
 public JOptionPaneDem(){
  JOptionPane.showMessageDialog(null,"读者编号不可以为空");
  
  JOptionPane.showConfirmDialog(null, "确定吗", "确认对话框",JOptionPane.YES_NO_OPTION );
  Object[] options = {"Java","C","C#"};
  int response = JOptionPane.showOptionDialog(this, "请选择你喜欢的语言", "选项对话框", JOptionPane.YES_OPTION,JOptionPane.QUESTION_MESSAGE, null, options,options[0]);
  if(response==0)
  {JOptionPane.showConfirmDialog(null, "你喜欢java语言，确定吗？","确认对话框", JOptionPane.YES_NO_OPTION);}
  else if(response==1)
  {JOptionPane.showConfirmDialog(null, "你喜欢C语言，确定吗？","确认对话框", JOptionPane.YES_NO_OPTION);}
  else if(response==2)
  {JOptionPane.showConfirmDialog(null, "你喜欢C#语言，确定吗？","确认对话框", JOptionPane.YES_NO_OPTION);}
  
  String inputValue = JOptionPane.showInputDialog("请输入：");
  Object[] possibleValues = {"北京","上海","沈阳"};
  
  Object selectedValue = JOptionPane.showInputDialog(null, "最宜居城市", "选择输入对话框", JOptionPane.INFORMATION_MESSAGE, null,possibleValues, possibleValues[0]);
  System.out.println("你选择了"+(String)selectedValue+"项目");

 }
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  new JOptionPaneDem();
  
 }

}