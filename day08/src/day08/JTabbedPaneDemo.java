package day08;
import javax.swing.*;

import java.awt.*;

public class JTabbedPaneDemo extends JFrame{
	public JTabbedPaneDemo(){
		//1.创建顶层容器	
		setSize(300,200);
		setTitle("JScrollpane");
		//2.实例化JScrollpane对象
		JTabbedPane jtabbedpane =new JTabbedPane();
		JPanel jpanel1 = new JPanel();
		JPanel jpanel2 = new JPanel();
		jtabbedpane.addTab("图书信息查询", jpanel1);
		jtabbedpane.addTab("图书信息修改", jpanel2);
		//把中间容器放入顶层容器
		this.add(jtabbedpane);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTabbedPaneDemo();
	}

}
