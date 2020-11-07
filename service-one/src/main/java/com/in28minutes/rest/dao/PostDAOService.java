package com.in28minutes.rest.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.in28minutes.rest.entity.Post;
import com.in28minutes.rest.entity.User;

@Component
public class PostDAOService {
	public static List<Post> postList;
	public static int count;
	static {
		postList = new ArrayList<Post>();
		postList.add(new Post(1,"Good Morning"));
		postList.add(new Post(2,"Have a great day!"));
		postList.add(new Post(3,"Happy new year!"));
		count = 3;
	}
	public List<Post> getPosts() {		
		return postList;
	}
	public void addPost(Post post) {
		if(post.getId()==null) {
			post.setId(++count);
		}
		postList.add(post);
	}
	public Post getPost(int postId) {
		for(Post iPost:postList) {
			if(iPost.getId()==postId) {
				return iPost;
			}
		}
		return null;
	}
	
	
}
