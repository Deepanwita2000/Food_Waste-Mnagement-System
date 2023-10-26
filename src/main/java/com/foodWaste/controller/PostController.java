package com.foodWaste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodWaste.entity.Post_Entity;
import com.foodWaste.service.PostService;

@RestController
public class PostController {
	@Autowired
PostService ps;
	
	@PostMapping("/addpostname")
	public Post_Entity adddonorname(@RequestBody Post_Entity post  ) {
		return ps.addpostname(post);
		
	}
	
	
	@GetMapping("/getpostname")
    public List<Post_Entity> getAllpost() {
	 	
       return ps.fetchAllPost_Entity();
    }
    
    
    @GetMapping("/getpostname/{id}") 
	  public Post_Entity getpostnameById(@PathVariable("post_id")int post_id)
	  {
    	return ps.getpostById(post_id);
		 
	  }
    
    @PutMapping("/postname/{id}")
    public Post_Entity updatepostname(@PathVariable("post_id") int post_id, @RequestBody Post_Entity post) {
    	return ps.upadtepostById(post_id, post);
       
    }
  
  @DeleteMapping("/postname/{id}")
  public String deletepostname(@PathVariable("post_id") int post_id) {
	return ps.deletepostById(post_id);
	 
  }
}
