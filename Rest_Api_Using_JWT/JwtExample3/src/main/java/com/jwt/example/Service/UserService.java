package com.jwt.example.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.example.model.User;

@Service
public class UserService {

	private List<User> store=new ArrayList<>();
	
	
	public UserService() {
		
		store.add(new User(UUID.randomUUID().toString(),"Arpit Katiyar","arpit@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Ankit Katiyar","ankit@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Anuj Katiyar","anuj@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Vikash Katiyar","vikash@gmail.com"));

	}
	
	public List<User> getUsers(){
		return this.store;
	}
}
