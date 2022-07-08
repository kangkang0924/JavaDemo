package com.bbs.db;

import java.sql.*;

import javax.print.PrintService;
public class StatementDemo {
	
	protected static String dbClassName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	static String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=db_bookborrow";
	static String dbUser = "sa";
	static String dbPWD="123456";
	private static Connection conn=null;
	private static Statement stmt=null;
	private static ResultSet rs=null;
	
	private StatementDemo () {
		try{
			if(conn==null){
				//����
				Class.forName(dbClassName).newInstance();
				conn = DriverManager.getConnection(dbURL,dbUser,dbPWD);
			}else{
				return;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//
	static void executeQuery(String rid){
		try{
			if(conn==null){
				new StatementDemo();
			}
				stmt=conn.createStatement();
				rs=stmt.executeQuery("select * from reader where readerid '"+rid+"'");
				while(rs.next()){
					System.out.println(rs.getString("readerid"));
					System.out.println(rs.getString("name"));
				}
		}catch(SQLException e){
				e.printStackTrace();
			}
		
	}
	static int executeInsert(String rid,String name){
		try{
			if(conn==null)
				new StatementDemo();
				
				stmt=conn.createStatement();
				String sql="insert into reader(readerid,name)values('"+rid+"','"+name+"')";
				int n=stmt.executeUpdate(sql);
				return n;
		}catch(SQLException e){
					e.printStackTrace();
					return -1;
				}
	}
	
	static int executeUpdate(String rid,String name){
		try{
			if(conn==null){
				new StatementDemo();
			}
				stmt=conn.createStatement();
				String sql = "update reader set name='"+name+"'where readerid'"+rid+"'";
				int n=stmt.executeUpdate(sql);
				return n;
		}catch(SQLException e){
			e.printStackTrace();
			return -1;
		}
		
	}
	
	static int executeDelete(String rid){
		try{
			if(conn==null){
				new StatementDemo();
			}
				stmt=conn.createStatement();
				String sql = "delete from reader where readerid='"+rid+"'";
				int n=stmt.executeUpdate(sql);
				return n;
				}catch(SQLException e){
					e.printStackTrace();
					return -1;
				}
	}
	public static void close(){
		try{
			conn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			conn=null;
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StatementDemo sd = new StatementDemo();
		sd.executeQuery("11301122");
		int i =sd.executeInsert("11301105", "����");
		System.out.println("ִ�в���,����ֵΪ:"+i);
		int u=sd.executeUpdate("11301105", "���");
		System.out.println("ִ���޸�,����ֵΪ:"+u);
		int d=sd.executeDelete("11301105");
		System.out.println("ִ��ɾ��,����ֵΪ:"+d);
		sd.close();
	}

}
