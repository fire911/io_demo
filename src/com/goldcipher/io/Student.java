package com.goldcipher.io;

import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer stuNo;
	
	private String stuName;
	
	private Integer stuAge;

	public Integer getStuNo() {
		return stuNo;
	}

	public void setStuNo(Integer stuNo) {
		this.stuNo = stuNo;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Integer getStuAge() {
		return stuAge;
	}

	public void setStuAge(Integer stuAge) {
		this.stuAge = stuAge;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer stuNo, String stuName, Integer stuAge) {
		super();
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuAge = stuAge;
	}

	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", stuName=" + stuName + ", stuAge=" + stuAge + "]";
	}
	
	

}
