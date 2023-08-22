package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee Table")
public class EmployeeModel {
	 @Id
	 @GeneratedValue
     private int id;
	 @Column(name="e_name")
     private String empname;
	 @Column(name="e_age")
     private int empage;
	@Column(name="e_sal")
     private int esalary;
	public EmployeeModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeModel(int id, String empname, int empage, int esalary) {
		super();
		this.id = id;
		this.empname = empname;
		this.empage = empage;
		this.esalary = esalary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpage() {
		return empage;
	}
	public void setEmpage(int empage) {
		this.empage = empage;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	
}
