package day09;

public class StringDemo {
/*
 * 1.ʲô���ַ�����
 * �Ѷ���ַ�����һ�����ı�����һ���ַ����飬char[]
 * 2.�ַ����ķ���
 * �ַ�����Ϊ���ɱ��ַ����Ͳ��ɱ��ַ���
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.�����ַ���
		//ֱ�Ӹ�ֵ
		String str ="hello";
		//ͨ�����췽��
		String str1 = new String("world");
		//2.�ַ�����ֵΪ��
		String str2 =null;//str2��δ��ʼ��δ���䴢��ռ�
		String str3 ="";//�Ѿ������˶��󣬷����˴���ռ䣬����Ϊ��
		//3.�ַ����Ƚ�
		String str4 ="ABC";
		String str5 ="ABC";
		if(str4==str5){
			System.out.println("���");
		}else{
			System.out.println("�����");
		}
		String str6="abc";
		String str7=new String("abc");
		if(str6==str7){
			System.out.println("���");
		}else{
			System.out.println("�����");
		}
		// == �жϵ��� �ڴ��ַ�Ƿ����
		// equals ���жϵ�ַ�Ƿ���ȣ������ַ����ȣ����ж��ַ������Ƿ����
		if(str6.equals(str7)){
			System.out.println("���");
		}else{
			System.out.println("�����");
		}
		//��������ȡ��hello��ͷ���ļ����ĺ�׺��
		String filename="abc.java;hello.myxq;hello.txt.java;hello.class";
		//���ַ������зָ�õ�һ������
		String[] res=filename.split(";");//�ָ�����
		for (String name : res){
		/*//1.�ж�ÿһ��Ԫ���Ƿ���hello��ͷ
		//2.��ȡ���һ�����λ�ã��±꣩
		//3.�����һ�����λ�ã���ȡ�ַ���
			String s1 = name.substring(name.lastIndexOf("."));
			System.out.println(s1);*/
			//1.�ж�ÿһ��Ԫ���Ƿ���hello��ͷ
			if(name.startsWith("hello")){
			//2.��ȡ���һ�����λ�ã��±꣩
				int index=name.lastIndexOf(".");
			//3.�����һ�����λ�ã���ȡ�ַ���
				String newName = name.substring(index);
				System.out.println(newName);
			}
			
			
			
		}
		/*StartsWith("hello");//�ж��Ƿ���hello��ͷ
		lastIndexOf(".");//��ȡ���һ������ֵ�λ��
		subString();//��ȡ��׺��
		*/
		for (String string : res) {
			
		}
		StringBuffer strb = new StringBuffer("student");
	  /*strb.append("s!");
		System.out.println(strb);
		strb.insert(0, "I am a");
		System.out.println(strb);
		strb.setCharAt(9, 'D');
		System.out.println(strb);
		strb.delete(1,4);
		System.out.println(strb);*/
		strb.replace(1,4,"ali");
		System.out.println(strb);
	}



}
