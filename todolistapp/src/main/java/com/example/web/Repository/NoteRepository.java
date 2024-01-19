package com.example.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.web.model.Notes;

public interface NoteRepository extends JpaRepository<Notes, Integer> {

}
