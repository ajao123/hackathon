package com.allissonjardel.hackathon.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.allissonjardel.hackathon.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
