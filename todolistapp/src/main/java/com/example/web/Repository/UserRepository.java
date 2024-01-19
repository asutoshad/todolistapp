package com.example.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.web.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
