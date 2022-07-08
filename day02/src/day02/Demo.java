package day02;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int num = 90;
          double num1 = num;//小到大   自动类型转换
          System.out.println(num1);//90.0自动类型转换
        	
          double num2 = 90.0;
          int num3 =(int)num2;    //大到小报错
          System.out.println(num3);//90 强制类型转换
//          age 内存名字
          int age = 18;
          System.out.println(age);
          
          int num4 = 5/2;
          System.out.println(num4);//向下取整  整数/整数=整数
//        提问：想要得到2.5怎么办
          double num5 = 5/2;
          System.out.println(num5);//2.0
          double num6 = 5.0/2;
          System.out.println(num6);//小数/整数=小数 
	}

}
