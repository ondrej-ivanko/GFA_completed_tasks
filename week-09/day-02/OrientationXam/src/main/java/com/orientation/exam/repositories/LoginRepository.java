package com.orientation.exam.repositories;

import com.orientation.exam.models.Login;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface LoginRepository extends CrudRepository<Login, Long> {

	@Query(value = "SELECT name FROM #{#entityName} name WHERE name.alias = ?1")
	public Login searchForNameInDB(String name);

	@Query(value = "SELECT something FROM #{#entityName} something WHERE something.alias = ?1")
	public Login findByAlias(String alias);

	@Query(value = "SELECT x FROM #{#entityName} x WHERE x.secretCode = ?1")
	public Login findBySecretCodeIsLike(String code);

	public void deleteById(Long id);

}
