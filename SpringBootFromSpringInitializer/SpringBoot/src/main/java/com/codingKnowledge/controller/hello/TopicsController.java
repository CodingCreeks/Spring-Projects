package com.codingKnowledge.controller.hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codingKnowledge.entity.Topic;
import com.codingKnowledge.service.TopicService;

@RestController
public class TopicsController {

	@Autowired
	private TopicService theTopicService;

	@RequestMapping("/hello")
	public String hello() {
		return "Welcome to the Spring Boot";
	}

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return theTopicService.getAllTopics();
	}

	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return theTopicService.getTopic(id);
	}

	@RequestMapping(value = "/topics", method = RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic) {
		theTopicService.addTopic(topic);
	}

	@RequestMapping(value = "/topics/{id}", method = RequestMethod.PUT)
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		theTopicService.updateTopic(id, topic);
	}

	@RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String id) {
		System.out.println("PathVariable in Delete method :"+id);
		theTopicService.deleteTopic(id);
	}
}
