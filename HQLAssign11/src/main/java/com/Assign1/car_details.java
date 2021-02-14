package com.Assign1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car_detailss")
public class car_details {
	@Column(name="RegNo",length = 20,nullable = false)
private String RefNo;
@Id
@Column(name="Model_name",length = 40)
private String Model;
@Column(name="color")
private String color;
@Column(name="Manufacturar")
private String Manu;
public car_details(String refNo, String model, String color, String manu) {
	super();
	RefNo = refNo;
	Model = model;
	this.color = color;
	Manu = manu;
}
public car_details() {
	super();
	// TODO Auto-generated constructor stub
}
public String getRefNo() {
	return RefNo;
}
public void setRefNo(String refNo) {
	RefNo = refNo;
}
public String getModel() {
	return Model;
}
public void setModel(String model) {
	Model = model;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getManu() {
	return Manu;
}
public void setManu(String manu) {
	Manu = manu;
}
@Override
public String toString() {
	return "car_details [RefNo=" + RefNo + ", Model=" + Model + ", color=" + color + ", Manu=" + Manu + "]";
}

	
}
