package com.situ.a;

public class Penguin extends Bird{
		@Override
	void fly(){
			System.out.println("企鹅起飞了");
		}
	void test(){
		System.out.println("test---------------");
		this.fly();//本类
		super.fly();//父类
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Penguin p = new Penguin();
		p.fly();
		p.test();
	}
}
