package com.situ.login;

public class User {
			String name;
			private int age;
			public void setAge(int age){
                if(age>0){
					this.age = age;
				}
                else {
                	System.out.println("¥Û∏Á£¨∏„¥Ì¡À∞…");
                }
			}
			public int getAge(){
				return this.age;
				
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           User user = new User();
        
	}

}

