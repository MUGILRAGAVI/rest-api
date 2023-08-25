package com.Day4.demo_Day4.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentdetail")
public class Student {
	@Id
	private int id;
	private String name;
	private String department;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public Student(int id, String name, String department, String mailid) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.mailid = mailid;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String mailid;

}
