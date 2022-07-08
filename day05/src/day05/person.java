package day05;
/*
 * 1.默认构造：1.默认构造:当类中没有声明任何形式的构造方法时，编译器会自动添加一个无参构造，空的构造方法
 * 叫做默认/缺省构造方法
 * 2.自定义构造：
 * （1)构造方法的名称与类的名完全相同，大小一致
 * （2）构造方法没有返回值类型，连void都不允许有
 * （3）没有return
 * （4）如果类中自定义了构造方法，则编译器不再提供默认构造方法
 * 3.构造方法的作用
 * （1）创建对象，必须和new一起使用
 * （2）完成对象初始化操作
 */
public class person {
	String name;
	int age;
    void show(){
    	System.out.println(name+" "+age);
	}
    	person(String userName,int userAge){
    		name = userName;
    		age = userAge;
    		show();
    	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		person p=new person("张三",20);
//		p.name =  "张三";
//		p.age = 20;
		person p1=new person("李四",18);
		person p2=new person("韩",12);
		
	}

}
