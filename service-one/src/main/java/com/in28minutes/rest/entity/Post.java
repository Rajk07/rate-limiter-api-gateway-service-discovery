package com.in28minutes.rest.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Post {
	private Integer id;
	private String description;
	
	
	
	public Post(Integer id,String description) {
		this.description = description;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Post [id=" + id + ", description=" + description + "]";
	}
	
	
}
