package com.courses.api.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.courses.api.models.Topic;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<Topic>( Arrays.asList(
			new Topic("1", "1 app", "1 Desc"),
			new Topic("2", "2 app", "2 Desc"),
			new Topic("3", "3 app", "3 Desc"),
			new Topic("4", "4 app", "4 Desc"),
			new Topic("5", "5 app", "5 Desc")
			));

	public List<Topic> getTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void deleteTopic(String id) {
		topics.remove(topics.stream().filter(t -> t.getId().equalsIgnoreCase(id)).findFirst().get());
	}
	
	public void deleteAllTopics() {
		topics.clear();
	}

	public void updateTopic(Topic topic, String id) {
//		topics.stream().filter( t -> t.getId().equalsIgnoreCase(id))
		deleteTopic(id);
		addTopic(topic);
		
	}
	
}
