package day04;

public class Goods {
	 String name;
     double price;
     int    number;
	 void getName(){
//		 return"������
		 System.out.println("������");
	 }//��Ա������������
	 int getNum(){
		 return 10; 
	 }
	 //��ӡ�����Ʒ���ֺ�����
	 void show(String name,int num){
		 System.out.println(name+""+num);
	 }
	public static void main(String[] args) {
		Goods g = new Goods();
//		new Goods (); ��������
//		g.name="��Ȫˮ";
//		g.price=2.5;
//		g.number=10;
//		System.out.println(g.name+" "+g.price+" "+g.number);
//		
		// TODO Auto-generated method stub
        System.out.println(g.getNum());
        g.show("������", 20);
	}

}
