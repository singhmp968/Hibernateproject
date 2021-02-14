
package com.Assign3.Assign3Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eId;
	private String ename;
	private String dept;
	private int sal;
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employee(int eId, String ename, String dept, int sal) {
		super();
		this.eId = eId;
		this.ename = ename;
		this.dept = dept;
		this.sal = sal;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "employee [eId=" + eId + ", ename=" + ename + ", dept=" + dept + ", sal=" + sal + "]";
	}
	
	
}
