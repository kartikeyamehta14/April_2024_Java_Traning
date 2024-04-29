package com.npci.asynchdemo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

@Service
public class UserService {
	
	
	public Flux<User> getUserAsync(){
		
		return Flux.range(1, 5).delayElements(Duration.ofSeconds(10))
				.map(i->new User(i,Thread.currentThread().getName()));
		
		
	}

	
	 public List<User> getUserSynch(){
		 List<User> users = new ArrayList<User>();
		 try {
		   for(int i=0;i<=5;i++) {
			   Thread.sleep(1000);
			   users.add(new User(i,Thread.currentThread().getName()));
			   
		   }
		} catch (Exception e) {
			// TODO: handle exception
		}
			return users;
	 } 
}
