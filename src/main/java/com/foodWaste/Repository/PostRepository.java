package com.foodWaste.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodWaste.entity.Post_Entity;
@Repository
public interface PostRepository extends JpaRepository<Post_Entity, Integer> {

}
