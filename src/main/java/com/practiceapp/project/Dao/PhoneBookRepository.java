package com.practiceapp.project.Dao;

import com.practiceapp.project.Entity.Phonebook;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneBookRepository  extends JpaRepository<Phonebook, Integer>{

}
