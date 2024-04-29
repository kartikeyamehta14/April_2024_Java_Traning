package com.npci.asynchdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api")
public class UserController {

	
	@Autowired
	UserService userService;
	
	
	//Synshronous code 
	@GetMapping(path="/sync",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<User> getUser1(){
		return userService.getUserSynch() ;
	}
	@GetMapping("/async")
	public Flux<User> getUser2(){
		return userService.getUserAsync() ;
	}
}
