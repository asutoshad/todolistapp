package com.example.web.Service;

import java.util.List;

import com.example.web.model.BlogAdmin;


public interface BlogAdminService {

	
	
	//save user
	BlogAdmin adminSave (BlogAdmin blogadmin);
	//show all users
	List<BlogAdmin> getAllAdmin();
	//show single user
	BlogAdmin getAdmin(Integer id );
	
	void updateAdmin(BlogAdmin badmin);
	
	void deleteAdmin(Integer id);
}
