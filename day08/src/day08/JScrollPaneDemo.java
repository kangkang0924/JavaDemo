package day08;
 import javax.swing.*;
 import java.awt.*;
 
public class JScrollPaneDemo extends JFrame{
		public JScrollPaneDemo(){
			//1.������������	
			setSize(300,200);
			setTitle("JScrollpane");
			//������ǩ
			JLabel jlabel =new JLabel("����һ�����������Ķ��󣬴���һ�����������Ķ��󣬴���һ�����������Ķ��󣬴���һ�����������Ķ���");
			//�����м�����
			JScrollPane jscrollpane =new JScrollPane(jlabel); 
			jscrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			//3.���м��������붥������
			this.add(jscrollpane);
			setVisible(true);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new JScrollPaneDemo();
	}

}
