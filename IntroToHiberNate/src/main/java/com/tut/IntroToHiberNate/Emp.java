package com.tut.IntroToHiberNate;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
@Entity
public class Emp {
	@Id
private int empid;
private String empName;
private String dept;

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
public Emp(int empid, String empName, String dept) {
	super();
	this.empid = empid;
	this.empName = empName;
	this.dept = dept;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "Emp [empid=" + empid + ", empName=" + empName + ", dept=" + dept + "]";
}



}
