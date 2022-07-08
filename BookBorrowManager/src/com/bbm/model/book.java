package com.bbm.model;
		//model:实体类
import java.sql.Date;

public class book {
	private String author; // 作者
	private String bookname; // 图书名
	private String edition ; //版次
	private String ISBN; // 图书isbn号
	private String press; 
	private Date publishdate; // 出版日期
	private String typeid; // 图书类型名称
	private String typename;
	private int price; // 图书单价
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public Date getPublishdate() {
		return publishdate;
	}
	public void setPublishdate(Date publishdate) {
		this.publishdate = publishdate;
	}
	public String getTypeid() {
		return typeid;
	}
	public void setTypeid(String typeid) {
		this.typeid = typeid;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}	


						


