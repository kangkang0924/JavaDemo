package day10;
/*
 * �ӿڣ�һ�ֹ淶
 * Java�ӿ�Ҳ��ʾһ�ֹ淶��ʹ�ó��󷽷�������һ�鹦�ܣ�����Ҫʵ�����ṩ����ʵ��
 * �ص㣺
 * 1.�ӿ�û�й��췽�������ܴ�������
 * 2.�ӿ��еķ������ǹ����ĳ��󷽷�
 * �ӿڵļ̳У��ӿ��ǿ��Լ̳еģ������Զ�̳У����ǲ��ܶ�̳е�
 * �ӿڵ�ʵ�֣����ص㣩
 */
interface IUsbable{
	 public abstract void transData();
}
//���ж���淶
interface IWalkable{
	public abstract void walk();
}
//ˮ������淶
interface ISwimable{
	public abstract void swim();
}
//�ӿڵļ̳�
//���ܶ���淶?
interface IAmphibianable extends IWalkable,ISwimable{
	
}
//�ӿڵ�ʵ��
class Animal{
	
}
class Cat extends Animal implements IWalkable{

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
		System.out.println("��è��");
	}
		
	
	
}
public class InterfaceDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cat cat =new Cat();
		//��̬�����������ֵ���������ͣ�����ʱ�����Ӵ�����
		IWalkable cat = new Cat();
		cat.walk();
	}
}
