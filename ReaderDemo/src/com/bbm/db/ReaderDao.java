package com.bbm.db;
import java.sql.*;
import java.util.*;

import com.bbm.model.Reader;
public class ReaderDao {
	//1.查询所有读者信息
	//2.static 修饰的方法是静态方法，调用的时候用类名，方法名();
	public static List<Reader> selectReader(){
		List<Reader> list = new ArrayList<Reader>();
		String sql="select * from reader";
		Dao.executeQuery(sql);
		ResultSet rs = Dao.executeQuery(sql);
		try {
			while(rs.next()){
				Reader reader = new Reader();
				reader.setRid(rs.getString("rid"));
				reader.setRname(rs.getString("rname"));
				reader.setRsex(rs.getString("rsex"));
				reader.setAge(rs.getInt("age"));
				list.add(reader);
				
				rs.getString("rid");
				rs.getString("rname");
		     	rs.getString("rsex");
				rs.getInt("age");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Dao.close();
		return list;
	}
	//条件查询
//	public static List<Reader> selectReaderByname(String Name){
//		List<Reader> list = new ArrayList<Reader>();
//		String sql="select * from reader where rname like '%";
//		Dao.executeQuery(sql);
//		ResultSet rs = Dao.executeQuery(sql);
//	}
	 /* 添加相关信息*/
    public static int insertReader( String rid,String rname,String rsex,int age) {
        int i=0;
            
            try {
            
        	String sql ="insert into Reader(rid,rname,rsex,age)values('"+rid+"','"+rname+"','"+rsex+"','"+age+"')";
            i = Dao.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Dao.close();
        return i;
    }
	 /* 修改相关信息*/
    public static int updateReader(String rid,String rname,String rsex,int age) {
 	   int i = 0;
      try {		   
 	       String sql = "update Reader set rname='"+rname+"',rsex='"+rsex+"',age='"+age+"' where rid='"+rid+"'";
 	       System.out.print(sql);
 	       i = Dao.executeUpdate(sql);
  		} catch (Exception e) {
  			e.printStackTrace();
  		}
  		Dao.close();
  		return i;
  }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
