package com.practiceapp.project.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Phonebook {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column
	private String Name;
	@Column
	private String Email;
	@Column
	private String Phone;
	public Phonebook() {}
	
	public Phonebook(int id, String name, String email, String phone) {
		super();
		this.id = id;
		Name = name;
		Email = email;
		Phone = phone;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	@Override
	public String toString() {
		return "Phonebook [id=" + id + ", Name=" + Name + ", Email=" + Email + ", Phone=" + Phone + "]";
	}
	
	
	
}
