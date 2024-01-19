package com.example.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Products {
	
	
	@Id
	private int id;
	private String name;
	private int price;
	private String description;
	
	@OneToOne
	@JoinColumn(name="category_id")
	private Category category;

}
