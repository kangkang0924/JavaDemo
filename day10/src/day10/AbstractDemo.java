package day10;
/*
 * 抽象类
 * 求圆、矩形、三角形的面积
 * 抽象方法；
 * 特点：
 * 1.没有方法体
 * 2.必须定义在抽象类或接口中
 * 3.子类必须要去覆盖此方法
 * 抽象类
 * 特点：
 * 1.抽象类不能直接创建对象
 * 2.在抽象类中可以有抽象方法和非抽象方法，抽象方法是让子类覆盖的，非抽象方法是让子类调用的
 * 抽象类和普通类的区别？
 * 1.抽象类是一个不完整的类，需作为一个父类，子类才能完成对应的功能
 * 2.抽象类不能创建对象
 * 3.抽象类必须要有子类才有意义
 */
abstract class Graph{
	abstract double getArea();//抽象方法
	
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
