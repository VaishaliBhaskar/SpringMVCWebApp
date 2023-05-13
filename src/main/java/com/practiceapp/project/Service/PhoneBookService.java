package com.practiceapp.project.Service;

import java.util.List;

import com.practiceapp.project.Dao.PhoneBookRepository;
import com.practiceapp.project.Entity.Phonebook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneBookService {

	@Autowired
	private PhoneBookRepository phone;
	
	//create a single contact
	public Phonebook createContact(Phonebook book) {
		phone.save(book);
		return book;
	}
		
	//create multiple contacts
	public List<Phonebook> createAllContact(List<Phonebook> books){
		return phone.saveAll(books);
	}
	
	//get contact by id
	public Phonebook getContactById(int id) {
		return phone.findById(id).get();
	
	}
	//get all contacts
	public List<Phonebook> getAllContact() {
		return phone.findAll();
	}
	
	//delete contact by id
	public void deleteContactById(int id) {
		 phone.deleteById(id);
		 
	}
	
	//delete all contacts
	public void deleteAllContact() {
		phone.deleteAll();
	}
	
	//Update a single contact
	public Phonebook updateContact(Phonebook book) {
		Phonebook Existing=phone.findById(book.getId()).orElse(null); 
		Existing.setName(book.getName());
		Existing.setPhone(book.getPhone());
		Existing.setEmail(book.getEmail());
		return phone.save(Existing);
	}
	
	
}
