package com.courses.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.courses.api.models.Topic;
import com.courses.api.service.TopicService;

@RestController
public class TopicsController {
	
	@Autowired
	TopicService topicService;

	@RequestMapping("/topicstest")
//	@GetMapping("/topicstest")
	public String getTopicsTest() {
		return "AllTopics";
	}
	
	// Get all topics
	@RequestMapping("/topics")
	public List<Topic> getTopics(){
		return topicService.getTopics();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable  String id) {
		topicService.updateTopic(topic,id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value =  "/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topicsdeleteall")
	public void deleteAll() {
		topicService.deleteAllTopics();
	}
}
