package com.embedded.listing.repository;

import com.embedded.listing.model.ToDo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {


	@Query(value = "SELECT * FROM to_do s WHERE s.title LIKE %?1%", nativeQuery = true)
	List<ToDo> findMyQuery(String query);


}
