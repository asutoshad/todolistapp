package com.example.web.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web.Repository.ContactRepository;
import com.example.web.Service.ContactService;

import com.example.web.model.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepository cont;

	@Override
	public Contact contactSave(Contact contact) {
		
		return cont.save(contact);
	}

	@Override
	public List<Contact> getAllContact() {
		// TODO Auto-generated method stub
		return cont.findAll();
	}

	@Override
	public Contact getContact(Integer id) {
		// TODO Auto-generated method stub
		return cont.findById(id).orElseThrow();
	}

	@Override
	public void updateContact(Contact contact) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletecontact(Integer id) {
		// TODO Auto-generated method stub
		
	}




	


}
