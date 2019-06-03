package com.embedded.listing.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class fsafd {

	@GetMapping("/customHeader")
	ResponseEntity<String> customHeader() {
		return ResponseEntity.badRequest()
				       .body("This is not good request");
	}
}
