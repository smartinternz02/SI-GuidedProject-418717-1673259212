package com.example.FlightAware248.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.FlightAware248.model.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    User findByEmailIdIgnoreCase(String emailId);
}
