package com.wcs.wildcircus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wcs.wildcircus.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);

}
