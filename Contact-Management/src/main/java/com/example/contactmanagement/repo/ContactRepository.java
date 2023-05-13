package com.example.contactmanagement.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.contactmanagement.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{
	
	List<Contact> findByFirstNameContainingIgnoreCase(String firstName);
	List<Contact> findByLastNameContainingIgnoreCase(String lastName);
	List<Contact> findByEmailContainingIgnoreCase(String email);

}
