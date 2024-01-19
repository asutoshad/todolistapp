package com.example.web.Service;

import java.util.List;

import com.example.web.model.Notes;


public interface NoteService {
	
	
	Notes noteSave (Notes notes);
	
	List<Notes> getallNotes();
	
	Notes getNote(Integer id );
	
	void updateNote(Notes notes);
	
	void deleteNote(Integer id);

}
