package com.situ.a;

public class Student extends Person{
		int sno;
		void study(){
			
		}
		 Student(){
			super(); //Ĭ�ϼ̳и����޲ι���
			System.out.println("���๹��");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.name = "����";
		s.age=10;
	}

}
