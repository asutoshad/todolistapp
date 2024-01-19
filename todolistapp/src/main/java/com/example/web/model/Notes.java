package com.example.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table (name ="notes")
public class Notes {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String courseId;
	private String description;

}
