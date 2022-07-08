package day06;

public class Point {
			int x;
			int y;
			//构造方法
			void show(){
			System.out.println(x+" "+y);
}
		Point(int x,int y){
			this.x = x;
			this.y = y;//this表示成员变量
			show();
}
		Point(int x){
			
		}
		Point(){
			
		}//
//成员方法
		int sum(int a, int b) {
				return a+b;
}
		double sum(double a,double b){
			return a+b;
			
		}
		double sum(double a,int b){
			return a+b;
			
		}
		void show1(){
			System.out.println(x+" "+y);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p=new Point(1,2);
/*1.定义point(点）类 	
 */
	}

}
     
