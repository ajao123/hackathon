package com.allissonjardel.hackathon.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.allissonjardel.hackathon.entities.Transcriptions;



@Repository
public interface TranscriptionRepository extends MongoRepository<Transcriptions, String>{

}
