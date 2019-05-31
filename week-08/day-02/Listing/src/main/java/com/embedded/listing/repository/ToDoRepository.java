package com.embedded.listing.repository;

import com.embedded.listing.model.ToDo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {


	@Query("SELECT s FROM ToDo s WHERE s.title LIKE %?1%")
	List<ToDo> findMyQuery(String query);


}
