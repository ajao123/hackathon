package com.allissonjardel.hackathon.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.allissonjardel.hackathon.entities.Lecture;

@Repository
public interface LectureRepository extends MongoRepository<Lecture, String>{

}
