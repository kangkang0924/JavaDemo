package day09;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����list
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list);
		//List�нǱ꣬���Ը����½Ǳ����Ԫ��
		list.add(1,"d");
		System.out.println(list);
		//���ݽǱ��ȡԪ��
		System.out.println(list.get(0));
		//����list
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}

}
