package com.example.web.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.web.Service.BlogService;
import com.example.web.Service.ContactService;
import com.example.web.model.Contact;
@Controller
public class HomeController {
@Autowired
private BlogService blogser;
@Autowired
private ContactService cont;
	
	@GetMapping("/")
	public String getHomepage(Model model) {
		model.addAttribute("blist", blogser.getAllBlogs());
		
		return "frontend/Homepage";
	}
	
	@GetMapping("/blog/{id}")
	public String edit(@PathVariable int id, Model model) {
		System.out.println(blogser.getBlog(id).getTitle());
		model.addAttribute("b", blogser.getBlog(id));
		model.addAttribute("blist", blogser.getAllBlogs());
		return "frontend/post";
	}
	
	
	@GetMapping("/contactus")
	public String getContact() {
		
		return "frontend/contact.html";
	}
	
	@PostMapping("/contact")
	public String postContact(@ModelAttribute Contact contact) {
		cont.contactSave(contact);
		return "frontend/contact.html";
	}
	

	
	
	@GetMapping("/aboutme")
	public String getAbout() {
		return "frontend/aboutme.html";
	}
	
	
	
}
  