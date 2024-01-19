package com.example.web.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web.Repository.UserRepository;
import com.example.web.Service.UserService;
import com.example.web.model.Users;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public Users userSave(Users users) {
		
		return userRepo.save(users);
	}

	@Override
	public List<Users> getAllUsers() {
		
		return userRepo.findAll();
	}

	@Override
	public Users getUser(Integer id) {
		
		return userRepo.findById(id).orElseThrow();
	}

	@Override
	public void updateUser(Users users) {
		 userRepo.save(users);
		
	}

	@Override
	public void deleteUser(Integer id) {
		userRepo.deleteById(id);
		
	}

	
	

}
