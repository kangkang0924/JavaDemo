package day10;
/*
 * ������
 * ��Բ�����Ρ������ε����
 * ���󷽷���
 * �ص㣺
 * 1.û�з�����
 * 2.���붨���ڳ������ӿ���
 * 3.�������Ҫȥ���Ǵ˷���
 * ������
 * �ص㣺
 * 1.�����಻��ֱ�Ӵ�������
 * 2.�ڳ������п����г��󷽷��ͷǳ��󷽷������󷽷��������า�ǵģ��ǳ��󷽷�����������õ�
 * ���������ͨ�������
 * 1.��������һ�����������࣬����Ϊһ�����࣬���������ɶ�Ӧ�Ĺ���
 * 2.�����಻�ܴ�������
 * 3.���������Ҫ�������������
 */
abstract class Graph{
	abstract double getArea();//���󷽷�
	
}
class Circle extends Graph{
	private int r;
	Circle(int r){
		this.r=r;
	}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return 3.14*r*r;
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c = new Circle(2);
		System.out.println(c.getArea());
	}

}
