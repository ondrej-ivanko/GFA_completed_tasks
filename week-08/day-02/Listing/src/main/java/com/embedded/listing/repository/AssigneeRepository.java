package com.embedded.listing.repository;

import com.embedded.listing.model.Assignee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AssigneeRepository extends CrudRepository<Assignee, Long> {

	@Query(value = "SELECT a FROM Assignee a WHERE a.name LIKE %?1% OR a.email LIKE %?1%")
	List<Assignee> findAnyUser(String query);
}
