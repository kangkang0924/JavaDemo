package com.situ.a;

public class Student extends Person{
		int sno;
		void study(){
			
		}
		 Student(){
			super(); //默认继承父类无参构造
			System.out.println("子类构造");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.name = "张三";
		s.age=10;
	}

}
