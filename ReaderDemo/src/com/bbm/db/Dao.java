package com.bbm.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
    protected static String dbClassName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    protected static String dbUrl = "jdbc:sqlserver://localhost:1433;" + "DatabaseName=Reader;";
    protected static String dbUser = "sa";
    protected static String dbPwd = "123456";
    private static Connection conn = null;
    /*
     * 
     */
    private Dao() {// 获得数据库连接
    	
    	try {
            if (conn == null) {
                Class.forName(dbClassName).newInstance();
                conn = DriverManager.getConnection(dbUrl, dbUser, dbPwd);
            } else
                return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    static ResultSet executeQuery(String sql) {// 执行查询操作
        try {
            if (conn == null){
            	 new Dao();
            }  
            return conn.createStatement().executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    static int executeUpdate(String sql) {// 执行其他操作

        try {
            if (conn == null){
            	 new Dao();
            }   
            return conn.createStatement().executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static void close() {// 关闭连接
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conn = null;
        }
    } 
}