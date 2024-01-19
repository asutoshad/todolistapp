package com.example.web.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.Service.UserService;
import com.example.web.model.Users;

@RestController
public class UserController {
	@Autowired
	private UserService us;
	
	@GetMapping("/userlist")
	public List<Users> getAll() {
		List<Users> userList= us.getAllUsers();
		
		
		return userList;
			
	}
	
	@GetMapping("/user/{id}")
	public Users getOne(@PathVariable Integer id) {
		return us.getUser(id);
	}
	
	@PostMapping("/user/add")
	public String addUser(@RequestBody Users uss) {
		us.userSave(uss);
	return "add success";
}
	
	@PutMapping("/user/update")
	public String updateUser(@RequestBody Users uss) {
		us.updateUser(uss);
		return "Success";
	}
	
	@DeleteMapping("user/delete/{id}")
	public String deleteUser(@PathVariable Integer id) {
		us.deleteUser(id);
		return "success";
	}
}