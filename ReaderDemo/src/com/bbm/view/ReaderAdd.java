package com.bbm.view;

import javax.swing.*;

import java.util.List;

import com.bbm.db.ReaderDao;
import com.bbm.model.Reader;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReaderAdd extends JFrame{
	JPanel tableJP,readerAddJP,buttonJP,genderJP,JP1,JP2,JP3,JP4,JP5,select_conditionJP;
	JLabel IDJL,nameJL,typeJL,genderJL,majorJL,phoneJL,deptJL,regJL;
	JTable jtable;
	
	JScrollPane jscrollpane;
	JTextField IDJTF,nameJTF,majorJTF,phoneJTF,deptJTF,regJTF,select_conditionJTF;
	JButton button1,button2,button3,setlectJB;
	JComboBox typeJCB,conditiongJCB,readertypeJCB,select_conditionJCB;
	JRadioButton manJRB,womanJRB;
	
	String[] readersearch={"���","����","�Ա�","����"};
	//String[] readersearch={"���","����","����","רҵ","�Ա�","�绰","ϵ��","ע������"};
	Object[][] getSelect(List<Reader> list){
        Object[][] results = new Object[list.size()][readersearch.length];
        for (int i = 0; i < list.size(); i++) {
            Reader reader = list.get(i);           
            results[i][0] = reader.getRid();            
            results[i][1] = reader.getRname();
            results[i][2] = reader.getRsex();
            results[i][3] = reader.getAge();       
        }
        return results;
    }
	public ReaderAdd(){
	  setSize(500,400);
	  setTitle("������Ϣ���");
	  //��һ���֣�������Ϣ������
	  JP2 = new JPanel();
	  readerAddJP = new JPanel();
	  JP2.setLayout(new GridLayout(2,4));
	  
	  select_conditionJP = new JPanel();
	  select_conditionJCB = new JComboBox();
	  String[] array={"���߱��","��������","�Ա�","����"};
	  for(int i=1;i<array.length;i++){
		  select_conditionJCB.addItem(array[i]);
	  }
	  select_conditionJP.add(select_conditionJCB);
	  select_conditionJTF = new JTextField();
	  select_conditionJTF.setColumns(20);
	  select_conditionJP.add(select_conditionJTF);
	  setlectJB =new JButton("��ѯ");
	  select_conditionJP.add(setlectJB);
	  JP5 = new JPanel();
	 
	  //Object[][] cellData={{"11301121","ѧ��","����","�����","��","18632159876","��Ϣ","2021-1-11"}};
		
	  jscrollpane = new JScrollPane();
	  jscrollpane.setPreferredSize(new Dimension(400,100));
	  Object[][] results=getSelect(ReaderDao.selectReader());
	  jtable = new JTable(results,readersearch);
	  //jtable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	  jscrollpane.setViewportView(jtable);
	  JP5.add(jscrollpane);
	  tableJP = new JPanel(new BorderLayout());
	  tableJP.add(select_conditionJP,BorderLayout.NORTH);
	  tableJP.add(JP5,BorderLayout.CENTER);
	  //�����һ��
	  IDJL=new JLabel("���߱�ţ�");
	  IDJTF=new JTextField(10);
	  nameJL=new JLabel("������");
	  nameJTF=new JTextField(10);
	  
	  
	  JP2.add(IDJL);
	  JP2.add(IDJTF);
	  JP2.add(nameJL);
	  JP2.add(nameJTF);
	  //����ڶ���
//	  typeJL=new JLabel("���ͣ�");
//	  typeJCB=new JComboBox();
//	  typeJCB.addItem("ѧ��");
//	  typeJCB.addItem("��ʦ");
	  
//	  genderJL = new JLabel("�Ա�");
//	  manJRB = new JRadioButton("��");
//	  womanJRB = new JRadioButton("Ů");
//	  ButtonGroup buttongroup = new ButtonGroup();
//	  buttongroup.add(manJRB);
//	  buttongroup.add(womanJRB);
//	  genderJP= new JPanel();
//	  genderJP.add(manJRB);
//	  genderJP.add(womanJRB);
	  
//	  JP2.add(typeJL);
//	  JP2.add(typeJCB);
//	  JP2.add(genderJL);
//	  JP2.add(genderJP);
//	  //
//	  majorJL=new JLabel("רҵ");
//	  majorJTF=new JTextField(10);
//	  phoneJL=new JLabel("�绰��");
//	  phoneJTF=new JTextField(10);

//	  JP2.add(majorJL);
//	  JP2.add(majorJTF);
//	  JP2.add(phoneJL);
//	  JP2.add(phoneJTF);
	  
	  deptJL=new JLabel("�Ա�");
	  deptJTF=new JTextField(10);
	  regJL=new JLabel("���䣺");
	  regJTF=new JTextField(10);
	  
	  JP2.add(deptJL);
	  JP2.add(deptJTF);
	  JP2.add(regJL);
	  JP2.add(regJTF);
	  
	   
	  button1=new JButton("�޸�");
	  button2=new JButton("�ر�");
	  button3=new JButton("����");
	  button3.addActionListener(new ActionEventHandler());
	  button1.addActionListener(new SelectActionListener());
	  JP3 = new JPanel();
	  JP3.add(button1);
	  JP3.add(button2);
	  JP3.add(button3);
	  
	  
	  this.add(tableJP,BorderLayout.NORTH);
	  this.add(JP2,BorderLayout.CENTER);
	  this.add(JP3,BorderLayout.SOUTH);
	  
	  setVisible(true);
	}
	class SelectActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String rid=IDJTF.getText().trim();
			String rname=nameJTF.getText().trim();
			String rsex=deptJTF.getText().trim();
			String age=regJTF.getText().trim();
			int j=ReaderDao.updateReader(rid, rname, rsex, Integer.parseInt(age));
			if(j==1){
				JOptionPane.showMessageDialog(null, "�޸ĳɹ�");
				Object[][] results=getSelect(ReaderDao.selectReader());
				jtable=new JTable(results,readersearch);
				jscrollpane.setViewportView(jtable);
			}
		}
		
	}
	class ActionEventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//��ȡ�����ı����е���Ϣ
			String rid=IDJTF.getText().trim();
			String rname=nameJTF.getText().trim();
			String rsex=deptJTF.getText().trim();
			String age=regJTF.getText().trim();
			//����ReaderDao�еĲ������ݿ�ķ���
			int i=ReaderDao.insertReader(rid, rname, rsex, Integer.parseInt(age));
			if(i==1){
				JOptionPane.showMessageDialog(null, "����ɹ�");
				//���²�ѯ���ݿ⣬��jtable���°�����Դ
				Object[][] results=getSelect(ReaderDao.selectReader());
				jtable=new JTable(results,readersearch);
				jscrollpane.setViewportView(jtable);
			} 
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new ReaderAdd();
	}

}
