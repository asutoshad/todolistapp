package com.example.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.web.model.BlogAdmin;

public interface BlogAdminRepository extends JpaRepository<BlogAdmin, Integer> {

}
