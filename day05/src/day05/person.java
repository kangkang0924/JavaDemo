package day05;
/*
 * 1.Ĭ�Ϲ��죺1.Ĭ�Ϲ���:������û�������κ���ʽ�Ĺ��췽��ʱ�����������Զ����һ���޲ι��죬�յĹ��췽��
 * ����Ĭ��/ȱʡ���췽��
 * 2.�Զ��幹�죺
 * ��1)���췽�����������������ȫ��ͬ����Сһ��
 * ��2�����췽��û�з���ֵ���ͣ���void����������
 * ��3��û��return
 * ��4����������Զ����˹��췽����������������ṩĬ�Ϲ��췽��
 * 3.���췽��������
 * ��1���������󣬱����newһ��ʹ��
 * ��2����ɶ����ʼ������
 */
public class person {
	String name;
	int age;
    void show(){
    	System.out.println(name+" "+age);
	}
    	person(String userName,int userAge){
    		name = userName;
    		age = userAge;
    		show();
    	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		person p=new person("����",20);
//		p.name =  "����";
//		p.age = 20;
		person p1=new person("����",18);
		person p2=new person("��",12);
		
	}

}
