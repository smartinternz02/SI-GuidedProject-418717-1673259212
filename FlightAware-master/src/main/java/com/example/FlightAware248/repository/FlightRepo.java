package com.example.FlightAware248.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.FlightAware248.model.UserIp;

@Repository
public interface FlightRepo extends CrudRepository<UserIp, Long> {
}
