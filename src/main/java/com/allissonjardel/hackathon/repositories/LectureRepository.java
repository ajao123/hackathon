package com.allissonjardel.hackathon.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.allissonjardel.hackathon.entities.Lecture;

@Repository
public interface LectureRepository extends MongoRepository<Lecture, String>{

	@Query("{ 'event_id' : { $regex: ?0, $options: 'i' } } ")
	List<Lecture> searchLectures(String event_id);
	
}
