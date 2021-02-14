package com.Assign3.IntroToHibernateAssign3;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class emp {
	@Id
	private int Id;
	private String name;
	private String desc;
	private int sal;
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public emp(int id, String name, String desc, int sal) {
		super();
		Id = id;
		this.name = name;
		this.desc = desc;
		this.sal = sal;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "emp [Id=" + Id + ", name=" + name + ", desc=" + desc + ", sal=" + sal + "]";
	}
	
	
}
