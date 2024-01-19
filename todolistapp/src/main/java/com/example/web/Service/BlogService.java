package com.example.web.Service;

import java.util.List;

import com.example.web.model.Blog;


public interface BlogService {
	
	
	//save user
	Blog blogSave (Blog blog);
	//show all users
	List<Blog> getAllBlogs();
	//show single user
	Blog getBlog(Integer id );
	
	void updateBlog(Blog blog);
	
	void deleteBlog(Integer id);

}
