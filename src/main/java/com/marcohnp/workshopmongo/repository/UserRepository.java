package com.marcohnp.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marcohnp.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
