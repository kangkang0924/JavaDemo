package day04;

public class Goods {
	 String name;
     double price;
     int    number;
	 void getName(){
//		 return"棒棒糖
		 System.out.println("棒棒糖");
	 }//成员方法（函数）
	 int getNum(){
		 return 10; 
	 }
	 //打印输出商品名字和数量
	 void show(String name,int num){
		 System.out.println(name+""+num);
	 }
	public static void main(String[] args) {
		Goods g = new Goods();
//		new Goods (); 匿名对象
//		g.name="矿泉水";
//		g.price=2.5;
//		g.number=10;
//		System.out.println(g.name+" "+g.price+" "+g.number);
//		
		// TODO Auto-generated method stub
        System.out.println(g.getNum());
        g.show("九阳神功", 20);
	}

}
