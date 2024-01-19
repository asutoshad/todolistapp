package com.example.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.web.model.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
