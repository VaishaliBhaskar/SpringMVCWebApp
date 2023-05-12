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
	
	
	public Phonebook createContact(Phonebook book) {
		phone.save(book);
		return book;
	}
		
	public List<Phonebook> createAllContact(List<Phonebook> books){
		return phone.saveAll(books);
	}
	
	
	public Phonebook getContactById(int id) {
		return phone.findById(id).get();
	
	}
	
	public List<Phonebook> getAllContact() {
		return phone.findAll();
	}
	public void deleteContactById(int id) {
		 phone.deleteById(id);
		 
	}
	public void deleteAllContact() {
		phone.deleteAll();
	}
	
	public Phonebook updateContact(Phonebook book) {
		Phonebook Existing=phone.findById(book.getId()).orElse(null); 
		Existing.setName(book.getName());
		Existing.setPhone(book.getPhone());
		Existing.setEmail(book.getEmail());
		return phone.save(Existing);
	}
	
	
}
