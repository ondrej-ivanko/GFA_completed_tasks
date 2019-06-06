package com.yondus.arrow.controllers;

import com.yondus.arrow.models.Arrow;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ArrowController {

	@GetMapping("/yondu")
	public ResponseEntity<Object> arrowCondition(@RequestParam (required = false) String distance,
	                             @RequestParam (required = false) String time) {
		if (distance == null && time == null) {
			return new ResponseEntity<>(new Error("Missing params"), HttpStatus.BAD_REQUEST);

		} else {
			Arrow arrow = new Arrow(distance, time);
			return new ResponseEntity<>(arrow, HttpStatus.OK);
		}
	}
}
