package com.andile.service;


import com.andile.model.Topic;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.stereotype.Service;

@Service
public class TopicService{

	private List<Topic> topicList = new ArrayList<>(Arrays.asList(
		new Topic("_spring","_Spring Framework in Action","Spring 5.0"),
		new Topic("_java","_Java 17 new features","Java 17.0 LTS")
	));

	public void addTopic(Topic topic){
		topicList.add(topic);
	}
	public List<Topic> getAllTopicList(){
		return topicList;
	}

}