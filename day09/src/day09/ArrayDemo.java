package day09;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.定义一维数组
		String[] array={"A","B","C","D"};
		//2.获取数组中的值，下角标从0开始，防止越界
		System.out.println(array[0]);
		//3.求数组长度，元素个数
		System.out.println(array.length);
		
		//4.遍历
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		//倒序输出
		for(int i=0;i<array.length;i++){
			System.out.println(array[array.length-i-1]);
		}
		for(int i=array.length-1;i>=0;i--){
			System.out.println(array[i]);
		}
		//二维数组
		int[][] ages={{17,18,19},{18,19,20},{19,20,21}};
		//遍历问题
//		for(int i=0;i<ages.length;i++){
//			for(int j=0;j<ages.length;j++){
//			System.out.println(ages[i][j]);
//			}
			
			
			for(int i=0;i<ages.length;i++){
//				int[] arr = ages[i];//{17,18,19}
				for(int j=0;j<ages[i].length;j++){
					System.out.println(ages[i][j]);
			}
		//forerch遍历
			String[] names={"张三","李四","王五"};
		//names:要遍历的数组名
		//String:数组的数据类型
		//name:是变量，可以任意命名，代表数组中的元素
			for(String name : names){
				System.out.println(name);
			}
		}
		
		
	}

}
