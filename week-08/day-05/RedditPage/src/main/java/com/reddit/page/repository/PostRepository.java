package com.reddit.page.repository;

import com.reddit.page.model.Post;
import org.springframework.data.domain.Pageable;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long>, Pageable {

	@Query(value = "SELECT p FROM Post post ORDER BY p.votes DESC")
	List<Post> findAllOnPage(Pageable pageable);
	List<Post> findAll();

}
