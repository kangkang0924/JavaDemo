package day09;

public class StringDemo {
/*
 * 1.什么是字符串？
 * 把多个字符串在一起，它的本质是一个字符数组，char[]
 * 2.字符串的分类
 * 字符串分为：可变字符串和不可变字符串
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.创建字符串
		//直接赋值
		String str ="hello";
		//通过构造方法
		String str1 = new String("world");
		//2.字符串的值为空
		String str2 =null;//str2还未初始化未分配储存空间
		String str3 ="";//已经创建了对象，分配了储存空间，内容为空
		//3.字符串比较
		String str4 ="ABC";
		String str5 ="ABC";
		if(str4==str5){
			System.out.println("相等");
		}else{
			System.out.println("不相等");
		}
		String str6="abc";
		String str7=new String("abc");
		if(str6==str7){
			System.out.println("相等");
		}else{
			System.out.println("不相等");
		}
		// == 判断的是 内存地址是否相等
		// equals 先判断地址是否相等，如果地址不相等，再判断字符内容是否相等
		if(str6.equals(str7)){
			System.out.println("相等");
		}else{
			System.out.println("不相等");
		}
		//案例：获取以hello开头的文件名的后缀名
		String filename="abc.java;hello.myxq;hello.txt.java;hello.class";
		//对字符串进行分割，得到一个数组
		String[] res=filename.split(";");//分割数组
		for (String name : res){
		/*//1.判断每一个元素是否以hello开头
		//2.获取最后一个点的位置（下标）
		//3.从最后一个点的位置，截取字符串
			String s1 = name.substring(name.lastIndexOf("."));
			System.out.println(s1);*/
			//1.判断每一个元素是否以hello开头
			if(name.startsWith("hello")){
			//2.获取最后一个点的位置（下标）
				int index=name.lastIndexOf(".");
			//3.从最后一个点的位置，截取字符串
				String newName = name.substring(index);
				System.out.println(newName);
			}
			
			
			
		}
		/*StartsWith("hello");//判断是否以hello开头
		lastIndexOf(".");//获取最后一个点出现的位置
		subString();//截取后缀名
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
