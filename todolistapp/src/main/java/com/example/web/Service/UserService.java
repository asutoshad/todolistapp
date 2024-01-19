package com.example.web.Service;

import java.util.List;


import com.example.web.model.Users;

public interface UserService {
	
	//save user
	Users userSave (Users users);
	//show all users
	List<Users> getAllUsers();
	//show single user
	Users getUser(Integer id );
	
	void updateUser(Users users);
	
	void deleteUser(Integer id);
	

}
