package com.bbm.model;

public class ReaderType {
	private int id; // 读者类型编号
	private int limit; // 读者类型名称
	private int maxborrownum;
	private String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getMaxborrownum() {
		return maxborrownum;
	}

	public void setMaxborrownum(int maxborrownum) {
		this.maxborrownum = maxborrownum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
