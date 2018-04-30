package com.fidel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fidel.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
