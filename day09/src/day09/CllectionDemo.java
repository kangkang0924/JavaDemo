package day09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/*1.什么是集合？存放数据的容器
 *2.数组和集合有什么区别？
 *（1）数组的疮毒是固定的，不可改变的；集合的长度是可以改变的，随元素的增加而增加
 *（2）数组能存放基本数据类型和引用数据类型：集合中只能存放应用数据类型，如果直接存放基本数据类型，会自动装箱（把基本数据类型转换为应用数据类型）
 *3.什么时候用数字？什么时候用集合？
 *如果元素个数固定，用数组	
 *如果元素个数不固定，用集合
 *4.集合的继承体系
 *
 *
 */
public class CllectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建集合
		Collection c = new ArrayList();
		//Collection c1 = new LinkedList();
		c.add("adc");
		//2.添加元素
		c.add(10);
		c.add(true);
		System.out.println(c);
		//3.从集合中删除指定元素
		c.remove(10);
		System.out.println(c);
		//4.清楚集合中的元素
		//c.clear();
		System.out.println(c);
		//5.判断集合是否为空
		System.out.println(c.isEmpty());
		//6.获取集合中元素的个数（集合的长度）
		System.out.println(c.size());
		//7.遍历
		//(1) 把集合转换成数组，进行遍历
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		Object[] array=c1.toArray();
		/*for(int i=0;i<array.length;i++){
		System.out.println(array[i]);	
		}*/
		//(2)用迭代器遍历（重要）
		
		
		Iterator it=c1.iterator();//将集合中的元素都放在迭代器里
		//获取迭代器中的内容，通过next()方法，相当于一个游标，指向第一个元素
		//调用next(),干了两件事，意识把当前元素获取出来，二叔游标向后走一位
		/*Object obj = it.next();
		System.out.println(obj);
		Object obj1 = it.next();
		System.out.println(obj1);
		Object obj2 = it.next();
		System.out.println(obj2);*/
		//it.hasNext();//用来判断集合当中是否有元素
		while(it.hasNext()){
			Object obj = it.next();
			System.out.println(obj);
		}
	}

}
