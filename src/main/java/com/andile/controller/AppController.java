package com.andile.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.andile.service.TopicService;
import lombok.RequiredArgsConstructor;
import com.andile.model.Topic;
import java.util.List;
@RestController
@RequiredArgsConstructor
public class AppController{

    
    private final TopicService service;

	// @PostMapping(value = "/topics")
    @RequestMapping(method=RequestMethod.POST, value="topics")
    public void create(@RequestBody Topic topic){
        service.addTopic(topic);
    }


    @GetMapping("/topics")
    public List<Topic> allTopics(){   
        return service.getAllTopicList();
    }

}