package com.example.web.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.web.Repository.NoteRepository;
import com.example.web.Service.NoteService;
import com.example.web.model.Notes;
@Service
public class NoteServiceImpl implements NoteService{
@Autowired
private NoteRepository noterepo;
	@Override
	public Notes noteSave(Notes notes) {
		
		return noterepo.save(notes);
	}

	@Override
	public List<Notes> getallNotes() {
		
		return noterepo.findAll();
	}

	@Override
	public Notes getNote(Integer id) {
		
		return noterepo.findById(id).get();
		
	}

	@Override
	public void updateNote(Notes notes) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteNote(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
