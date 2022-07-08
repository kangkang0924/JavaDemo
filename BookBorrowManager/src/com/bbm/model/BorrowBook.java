package com.bbm.model;

import java.sql.Date;

public class BorrowBook {

		private Date borrowdate; // 借书日期
		private double fine; // 罚金
		private String ISBN; // 图书isbn编号
		private String readerid;
		private Date returndate; // 还书日期
		public Date getBorrowdate() {
			return borrowdate;
		}
		public void setBorrowdate(Date borrowdate) {
			this.borrowdate = borrowdate;
		}
		public double getFine() {
			return fine;
		}
		public void setFine(double fine) {
			this.fine = fine;
		}
		public String getISBN() {
			return ISBN;
		}
		public void setISBN(String iSBN) {
			ISBN = iSBN;
		}
		public String getReaderid() {
			return readerid;
		}
		public void setReaderid(String readerid) {
			this.readerid = readerid;
		}
		public Date getReturndate() {
			return returndate;
		}
		public void setReturndate(Date returndate) {
			this.returndate = returndate;
		}
		
     }
