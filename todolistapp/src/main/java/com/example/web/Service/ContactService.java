package com.example.web.Service;

import java.util.List;

import com.example.web.model.Contact;




public interface ContactService {

	
	
	//save user
	Contact contactSave (Contact contact);
	//show all users
	List<Contact> getAllContact();
	//show single user
	Contact getContact(Integer id );
	
	void updateContact(Contact contact);
	
	void deletecontact(Integer id);
}
