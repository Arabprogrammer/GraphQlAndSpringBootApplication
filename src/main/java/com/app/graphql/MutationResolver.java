package com.app.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.model.User;
import com.app.repo.UserRepo;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class MutationResolver implements GraphQLMutationResolver {
	
	@Autowired
	UserRepo userRepo;
	
	public User saveUser(String name){
		
		return userRepo.save(new User(name));
	}

}
