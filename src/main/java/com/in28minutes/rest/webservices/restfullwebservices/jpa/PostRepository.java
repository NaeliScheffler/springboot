package com.in28minutes.rest.webservices.restfullwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.rest.webservices.restfullwebservices.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {
	



}
