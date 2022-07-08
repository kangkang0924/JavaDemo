package day08;
 import javax.swing.*;
 import java.awt.*;
 
public class JScrollPaneDemo extends JFrame{
		public JScrollPaneDemo(){
			//1.创建顶层容器	
			setSize(300,200);
			setTitle("JScrollpane");
			//创建标签
			JLabel jlabel =new JLabel("创建一个带滚动条的对象，创建一个带滚动条的对象，创建一个带滚动条的对象，创建一个带滚动条的对象，");
			//创建中间容器
			JScrollPane jscrollpane =new JScrollPane(jlabel); 
			jscrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			//3.把中间容器放入顶层容器
			this.add(jscrollpane);
			setVisible(true);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new JScrollPaneDemo();
	}

}
