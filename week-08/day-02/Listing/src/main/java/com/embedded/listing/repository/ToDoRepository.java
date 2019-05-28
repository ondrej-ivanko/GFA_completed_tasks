package com.embedded.listing.repository;

import com.embedded.listing.model.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}
