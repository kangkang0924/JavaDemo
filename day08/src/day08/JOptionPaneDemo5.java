package day08;

import javax.swing.*;
import java.awt.*;

public class JOptionPaneDemo5 extends JFrame {
    public JOptionPaneDemo5(){
     Object[] possibleValues={"北京","上海","沈阳"};
     Object selectedValue=JOptionPane.showInputDialog(null,"最宜居城市","选择输入框",JOptionPane.INFORMATION_MESSAGE,null,possibleValues,possibleValues[0]);
     System.out.println("你选择了"+(String)selectedValue+"项目");
    }
  
 public static void main(String[] args) {
  // TODO Auto-generated method stub
    new JOptionPaneDemo5();
 }

}