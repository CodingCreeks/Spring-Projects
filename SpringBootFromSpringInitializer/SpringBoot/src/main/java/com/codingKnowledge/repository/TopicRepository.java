package com.codingKnowledge.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingKnowledge.entity.Topic;

@Repository
public interface TopicRepository extends CrudRepository<Topic, String> {

}
