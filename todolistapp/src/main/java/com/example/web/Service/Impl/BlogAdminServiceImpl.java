package com.example.web.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web.Repository.BlogAdminRepository;
import com.example.web.Service.BlogAdminService;
import com.example.web.model.BlogAdmin;
@Service
public class BlogAdminServiceImpl implements BlogAdminService{
@Autowired
private BlogAdminRepository blogadmin;

@Override
public BlogAdmin adminSave(BlogAdmin blogadmin) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<BlogAdmin> getAllAdmin() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public BlogAdmin getAdmin(Integer id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void updateAdmin(BlogAdmin badmin) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAdmin(Integer id) {
	// TODO Auto-generated method stub
	
}


}
