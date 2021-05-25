package com.app.graphql;

import java.time.Duration;

import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.model.User;
import com.app.repo.UserRepo;
import com.coxautodev.graphql.tools.GraphQLSubscriptionResolver;

import reactor.core.publisher.Flux;

@Component
public class SubscriptionResolver implements GraphQLSubscriptionResolver {

	@Autowired
	UserRepo userRepo;

	Integer counter = 1;

	public Publisher<User> getSubscriberCounter(Integer id) {
		return Flux.interval(Duration.ofSeconds(1)).map(num -> new User("user", ++counter));
	}
}
