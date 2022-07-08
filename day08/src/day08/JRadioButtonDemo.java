package day08;
import java.awt.*;

import javax.swing.*;


public class JRadioButtonDemo extends JFrame{
 public JRadioButtonDemo(){
  setSize(300,150);
  setTitle("JRadioButton");
  //创建中间容器
  JPanel genderJPanel = new JPanel();
  
  //创建基本组件
//  JLabel jlabel = new JLabel();
  Label usermaneLabel = new Label("性别:");
  JRadioButton manJRB = new JRadioButton("男");
  JRadioButton womanJRB = new JRadioButton("女");
  
  //把基本组件放到中间容器
//  genderJPanel.add(jlabel);
  genderJPanel.add(usermaneLabel);
  genderJPanel.add(manJRB);
  genderJPanel.add(womanJRB);
  
  //实例化ButtonGroup，解决互斥问题
  ButtonGroup buttongroup = new ButtonGroup();
  buttongroup.add(manJRB);
  buttongroup.add(womanJRB);
  
  //把中间容器放到顶层容器
  this.add(genderJPanel);
  setVisible(true);
  
 }
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  new JRadioButtonDemo();
 }

}


