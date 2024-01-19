package com.example.web.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web.Repository.BlogRepository;
import com.example.web.Service.BlogService;
import com.example.web.model.Blog;
@Service
public class BlogServiceImpl implements BlogService {
@Autowired
	private BlogRepository blogrepo;


	@Override
	public Blog blogSave(Blog blog) {
		return blogrepo.save(blog);
	}

	@Override
	public List<Blog> getAllBlogs() {
		// TODO Auto-generated method stub
		return blogrepo.findAll();
	}

	
	@Override
	public Blog getBlog(Integer id) {
		
		return blogrepo.findById(id).get();
	}

	@Override
	public void updateBlog(Blog blog) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBlog(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
