package day09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/*1.ʲô�Ǽ��ϣ�������ݵ�����
 *2.����ͼ�����ʲô����
 *��1������Ĵ����ǹ̶��ģ����ɸı�ģ����ϵĳ����ǿ��Ըı�ģ���Ԫ�ص����Ӷ�����
 *��2�������ܴ�Ż����������ͺ������������ͣ�������ֻ�ܴ��Ӧ���������ͣ����ֱ�Ӵ�Ż����������ͣ����Զ�װ�䣨�ѻ�����������ת��ΪӦ���������ͣ�
 *3.ʲôʱ�������֣�ʲôʱ���ü��ϣ�
 *���Ԫ�ظ����̶���������	
 *���Ԫ�ظ������̶����ü���
 *4.���ϵļ̳���ϵ
 *
 *
 */
public class CllectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������
		Collection c = new ArrayList();
		//Collection c1 = new LinkedList();
		c.add("adc");
		//2.���Ԫ��
		c.add(10);
		c.add(true);
		System.out.println(c);
		//3.�Ӽ�����ɾ��ָ��Ԫ��
		c.remove(10);
		System.out.println(c);
		//4.��������е�Ԫ��
		//c.clear();
		System.out.println(c);
		//5.�жϼ����Ƿ�Ϊ��
		System.out.println(c.isEmpty());
		//6.��ȡ������Ԫ�صĸ��������ϵĳ��ȣ�
		System.out.println(c.size());
		//7.����
		//(1) �Ѽ���ת�������飬���б���
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		Object[] array=c1.toArray();
		/*for(int i=0;i<array.length;i++){
		System.out.println(array[i]);	
		}*/
		//(2)�õ�������������Ҫ��
		
		
		Iterator it=c1.iterator();//�������е�Ԫ�ض����ڵ�������
		//��ȡ�������е����ݣ�ͨ��next()�������൱��һ���αָ꣬���һ��Ԫ��
		//����next(),���������£���ʶ�ѵ�ǰԪ�ػ�ȡ�����������α������һλ
		/*Object obj = it.next();
		System.out.println(obj);
		Object obj1 = it.next();
		System.out.println(obj1);
		Object obj2 = it.next();
		System.out.println(obj2);*/
		//it.hasNext();//�����жϼ��ϵ����Ƿ���Ԫ��
		while(it.hasNext()){
			Object obj = it.next();
			System.out.println(obj);
		}
	}

}
