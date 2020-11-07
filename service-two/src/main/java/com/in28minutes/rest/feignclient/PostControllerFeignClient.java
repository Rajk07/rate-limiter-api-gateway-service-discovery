package com.in28minutes.rest.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.in28minutes.rest.entity.Post;

@FeignClient(value="service1")
public interface PostControllerFeignClient {
	@RequestMapping( method=RequestMethod.GET, value="/posts")
	public List<Post> getPosts();
}
