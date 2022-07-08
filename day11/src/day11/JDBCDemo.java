package day11;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class JDBCDemo {
	
	protected static String dbClassName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	static String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=db_bookborrow";
	static String dbUser = "sa";
	static String dbPWD="123456";
	private static Connection conn=null;
	private static Statement stmt=null;
	private static ResultSet rs=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.加载数据驱动
		
		try{
			try{
				//1.注册驱动
				Class.forName(dbClassName).newInstance();
			}catch(Exception e){
				e.printStackTrace();
			}
			//2.创建数据库连接
			conn=DriverManager.getConnection(dbURL,dbUser,dbPWD);
			//3.创建statement对象
			stmt=conn.createStatement();
			//4.调用语句对象的executeQuery()方法执行查询语句
			rs = stmt.executeQuery("select * from reader where readerid='11301121'");
			while(rs.next()){
				System.out.println(rs.getString("readerid"));
				System.out.println(rs.getString("name"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				rs.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
			try{		
				stmt.close();			
			}catch(SQLException e){
				e.printStackTrace();
			}
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
	}
	

}

