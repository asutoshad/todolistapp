package com.example.web.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.Service.NoteService;
import com.example.web.model.Notes;


@RestController
@CrossOrigin
public class NoteController {
@Autowired

private NoteService noteser;

@GetMapping("/notelist")
public List<Notes> getAll() {
	List<Notes> notelist= noteser.getallNotes();
	
	
	return notelist;
		
}

@PostMapping("/note/add")
public String addNote(@RequestBody Notes note) {
	noteser.noteSave(note);
return "add success";
}


@GetMapping("/note/{id}")
public Notes getOne(@PathVariable Integer id) {
	return noteser.getNote(id);
}


}
