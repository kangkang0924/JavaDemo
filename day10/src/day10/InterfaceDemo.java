package day10;
/*
 * 接口：一种规范
 * Java接口也表示一种规范，使用抽象方法来定义一组功能，必须要实现者提供方法实现
 * 特点：
 * 1.接口没有构造方法，不能创建对象
 * 2.接口中的方法都是公共的抽象方法
 * 接口的继承：接口是可以继承的，它可以多继承，类是不能多继承的
 * 接口的实现：（重点）
 */
interface IUsbable{
	 public abstract void transData();
}
//爬行动物规范
interface IWalkable{
	public abstract void walk();
}
//水生动物规范
interface ISwimable{
	public abstract void swim();
}
//接口的继承
//两栖动物规范?
interface IAmphibianable extends IWalkable,ISwimable{
	
}
//接口的实现
class Animal{
	
}
class Cat extends Animal implements IWalkable{

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
		System.out.println("走猫步");
	}
		
	
	
}
public class InterfaceDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cat cat =new Cat();
		//多态，把子类对象赋值给父类类型，运行时表现子代特征
		IWalkable cat = new Cat();
		cat.walk();
	}
}
