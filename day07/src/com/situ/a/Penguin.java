package com.situ.a;

public class Penguin extends Bird{
		@Override
	void fly(){
			System.out.println("��������");
		}
	void test(){
		System.out.println("test---------------");
		this.fly();//����
		super.fly();//����
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Penguin p = new Penguin();
		p.fly();
		p.test();
	}
}
