package com.app.graphql;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.model.User;
import com.app.repo.UserRepo;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class UserResolver implements GraphQLQueryResolver  {
	
	@Autowired
	UserRepo userRepo;

	public Optional<User> getUserById(Integer id) throws Exception {
		return userRepo.findById(id);
	}


}
