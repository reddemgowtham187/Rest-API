package com.kodnest.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	int sid;
    String sname;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid,String sname) {
		super();
		this.sname = sname;
		this.sid = sid;
	}
	
	public String getName() {
		return sname;
	}
	public void setName(String name) {
		this.sname = name;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "Student [name=" + sname + ", sid=" + sid + "]";
	}
       
}


