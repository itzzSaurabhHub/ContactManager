package com.example.contactmanagement.service;

import java.util.List;

import com.example.contactmanagement.dto.ContactRequest;
import com.example.contactmanagement.dto.ContactResponse;

public interface ContactService {

	List<ContactResponse> getAllContacts();
	
	ContactResponse getContactById(Long id);
	
	List<ContactResponse> searchContactByFirstName(String firstName);
	
	List<ContactResponse> searchContactByLastName(String lastName);
	
	List<ContactResponse> searchContactByEmail(String email);
	
	ContactResponse createContact(ContactRequest request);
	
	ContactResponse updateContact(Long id, ContactRequest request);
	
	void deleteContact(Long id);
	
}
