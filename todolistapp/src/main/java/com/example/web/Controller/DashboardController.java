package com.example.web.Controller;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.web.Service.BlogService;
import com.example.web.Service.ContactService;
import com.example.web.model.Blog;

@Controller

public class DashboardController {
	@Autowired
	private BlogService blogser;
	@Autowired
	private ContactService cont;
	@GetMapping ("/dashboard")
	public String getDashboard() {
	return "backend/index.html";
	}
	
	@GetMapping ("/addblog")
	public String getItems() {
	return "backend/AddItems.html";
	}
	
	@GetMapping ("/messages")
	public String getMessage(Model model) {
		model.addAttribute("mlist", cont.getAllContact());
	return "backend/Message.html";
	}
	
	
	
//	@PostMapping("/additems")
//	public String postItems(@ModelAttribute Blog blog) {
//		
//		blogser.blogSave(blog);
//		
//		return "backend/AddItems.html";
//	}
//	

	@PostMapping("/additems")
	public String postItems(@ModelAttribute Blog blog,@RequestParam MultipartFile photo, Model model) {
		
		blog.setImage(photo.getOriginalFilename());
		
		blogser.blogSave(blog);
		  if (!photo.isEmpty()) {
		        try {
		            Files.copy(photo.getInputStream(), Path.of("src/main/resources/static/img/" + photo.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
		            model.addAttribute("message", "Upload successful");
		        } catch (IOException e) {
		            e.printStackTrace();
		            model.addAttribute("message", "Something went wrong during upload. Please try again.");
		        }
		    } else {
		        model.addAttribute("message", "No image selected for upload.");
		    }
		return "backend/AddItems.html";
	}

}
