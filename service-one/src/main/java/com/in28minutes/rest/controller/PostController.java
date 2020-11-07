package com.in28minutes.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.in28minutes.rest.dao.PostDAOService;
import com.in28minutes.rest.entity.Post;

@Controller
public class PostController {
	
	@Autowired
	PostDAOService postDAOService;
	
	@GetMapping("/posts")
	public ResponseEntity<Object> getPost() {
		List<Post> posts = postDAOService.getPosts();
		return new ResponseEntity<>(posts,HttpStatus.OK);
	}
}
