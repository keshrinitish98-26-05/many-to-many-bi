package com.ty.PersonAndCab;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Person {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private int age;
	@ManyToMany
	@JoinTable(name = "My_person_cab",joinColumns = @JoinColumn(name = "my_person_id"),
	inverseJoinColumns = @JoinColumn(name= "my_cab_id"))
	private List<Cab> cab;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Cab> getCab() {
		return cab;
	}
	public void setCab(List<Cab> cab) {
		this.cab = cab;
	}
	
}
