package com.orientation.exam.services;

import com.orientation.exam.models.Login;
import com.orientation.exam.models.SecretCodeArrived;
import com.orientation.exam.repositories.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {

	@Autowired
	LoginRepository repo;

	public LoginService() {
	}

	public String secretCodeBuilder() {
		String code = "";
		for (int i = 0; i < 4; i++) {
			int addNum = (int)(Math.random() * 10);
			code += addNum;
		}
		return code;
	}

	public void setCode(Login login) {
		login.setSecretCode(secretCodeBuilder());
	}

	public Login lookForAlias(String alias) {
		return repo.searchForNameInDB(alias);
	}

	public void save(Login login) {
		login.setAlias(login.getAlias());
		login.setSecretCode(secretCodeBuilder());
		repo.save(login);
	}

	public boolean aliasInDatabase(Login login) {
		return lookForAlias(login.getAlias()) != null;
	}

	public Login findbyId(Login login) {
		return repo.findById(login.getId()).get();
	}

	public Iterable<Login> findAllObjects() {
		return repo.findAll();
	}

//	public void incrementCount(AtomicInteger counter) {
//		counter.getAndIncrement();
//	}

	public boolean findAndIncrement(String alias) {
		if (repo.findByAlias(alias) != null) {
			Login login = repo.findByAlias(alias);
			raiseCounter(login);
			return true;
		}
		return false;
	}

	public void raiseCounter(Login login) {
		login.setCounter(login.getCounter() + 1);
	}

	public String findUrl(String alias) {
		return repo.findByAlias(alias).getUrl();
	}

	public Iterable<Login> getAllLinks() {
		return repo.findAll();
	}

	public boolean isSecretCodeInDb(SecretCodeArrived secretCode) {
		Login login = repo.findBySecretCodeIsLike(secretCode.getSecretCode());
		if (login != null) {
		    return true;
		} else {
			return false;
		}
	}

	public void deleteLogin(Long id) {
		repo.deleteById(id);
	}
}
