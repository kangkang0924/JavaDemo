package day09;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.����һά����
		String[] array={"A","B","C","D"};
		//2.��ȡ�����е�ֵ���½Ǳ��0��ʼ����ֹԽ��
		System.out.println(array[0]);
		//3.�����鳤�ȣ�Ԫ�ظ���
		System.out.println(array.length);
		
		//4.����
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		//�������
		for(int i=0;i<array.length;i++){
			System.out.println(array[array.length-i-1]);
		}
		for(int i=array.length-1;i>=0;i--){
			System.out.println(array[i]);
		}
		//��ά����
		int[][] ages={{17,18,19},{18,19,20},{19,20,21}};
		//��������
//		for(int i=0;i<ages.length;i++){
//			for(int j=0;j<ages.length;j++){
//			System.out.println(ages[i][j]);
//			}
			
			
			for(int i=0;i<ages.length;i++){
//				int[] arr = ages[i];//{17,18,19}
				for(int j=0;j<ages[i].length;j++){
					System.out.println(ages[i][j]);
			}
		//forerch����
			String[] names={"����","����","����"};
		//names:Ҫ������������
		//String:�������������
		//name:�Ǳ����������������������������е�Ԫ��
			for(String name : names){
				System.out.println(name);
			}
		}
		
		
	}

}
