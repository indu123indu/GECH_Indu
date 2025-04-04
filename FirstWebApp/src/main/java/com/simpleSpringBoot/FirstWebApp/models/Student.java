package com.simpleSpringBoot.FirstWebApp.models;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
 * Java SE -Standard edition -->java.base
 * Java EE or j2ee - Enterprise Edition -->javax
 * now java EE is called as jakarta
 * */

@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "std_id")
	private long id;//id
	
	@Column(name ="std_name")
	private String name;
	
	@Column(name = "std_age")
	private String age;
	
	@Column(name ="std_address")
	private String address;
	
	
	public Student(long id, String name, String age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	
	public static void main(String[] args) {
		
	}

}
