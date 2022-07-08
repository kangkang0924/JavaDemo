package day08;


import java.awt.*;

import javax.swing.*;
public class JCheckBoxDemo extends JFrame{
	public JCheckBoxDemo(){
		setSize(500,150);
		setTitle("JCheckBox");
		//创建中间容器
				JPanel JcBJPanel1 = new JPanel();
				JPanel JcBJPanel2 = new JPanel();
				
		//创建基本组件		
				Label usermaneLabel = new Label("请选择你中意的岗位和工资");
				JCheckBox jCheckBox1 = new JCheckBox("软件工程师");
				JCheckBox jCheckBox2 = new JCheckBox("软件测试师");
				JCheckBox jCheckBox3 = new JCheckBox("3000");
				JCheckBox jCheckBox4 = new JCheckBox("5000");
				
		//把基本组件放到中间容器		
				JcBJPanel1.add(usermaneLabel);
				JcBJPanel2.add(jCheckBox1);
				JcBJPanel2.add(jCheckBox2);
				JcBJPanel2.add(jCheckBox3);
				JcBJPanel2.add(jCheckBox4);
				
		//把中间容器放到顶层容器中		
				this.add(JcBJPanel1,BorderLayout.NORTH);
				this.add(JcBJPanel2,BorderLayout.CENTER);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				new JCheckBoxDemo();
	}

}