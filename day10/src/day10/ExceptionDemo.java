package day10;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.ʲô���쳣��Java���й����г��ֵĴ���
		try{
			//��������쳣
			System.out.println(10/0);
		}catch(Exception e){
			//�����쳣
			e.printStackTrace();//��ӡ�쳣��Ϣ 
		}finally{
			//�����ͷ���Դ
			System.out.println("����finally");
		}
		System.out.println("aaa");
	}

}
