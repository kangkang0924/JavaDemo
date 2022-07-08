package day10;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.什么是异常？Java运行过程中出现的错误
		try{
			//用来检测异常
			System.out.println(10/0);
		}catch(Exception e){
			//捕获异常
			e.printStackTrace();//打印异常信息 
		}finally{
			//用于释放资源
			System.out.println("我是finally");
		}
		System.out.println("aaa");
	}

}
