package com.hem.springboot.demo;

import javax.persistence.*;


@Entity
public class User {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer id;
  @Column
  private String name;
  @Column
  private String gender;
  @Column
  private String address;
  @Column
  private String phone;
  
 public Integer getId() {
	    return id;
	  }
public void setId(Integer id) {
	    this.id = id;
	  }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
}
