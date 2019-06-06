package com.orientation.exam.controllers;

import com.orientation.exam.models.SecretCodeArrived;
import com.orientation.exam.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LinksManipulationController {

	@Autowired
	private LoginService service;

	@Autowired
	public LinksManipulationController(LoginService service) {
		this.service = service;
	}

	@GetMapping("/api/links")
	public Object returnAllLinks() {
		return service.getAllLinks();
	}

	@DeleteMapping("/api/links/{id}")
	public ResponseEntity deleteLink(@PathVariable Long id, @RequestBody SecretCodeArrived code) {
		if (code == null) {
			return ResponseEntity.badRequest().build();
		}
		else if (!service.isSecretCodeInDb(code)) {
			return ResponseEntity.status(403).build();
		}
		else {
		service.deleteLogin(id);
		return ResponseEntity.ok().build();
		}
	}
}
