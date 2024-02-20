package com.codewithsaujan.fullstackbackend.repository;

import com.codewithsaujan.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
