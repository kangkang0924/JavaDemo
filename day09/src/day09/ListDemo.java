package day09;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建list
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list);
		//List有角标，可以根据下角标添加元素
		list.add(1,"d");
		System.out.println(list);
		//根据角标获取元素
		System.out.println(list.get(0));
		//遍历list
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}

}
