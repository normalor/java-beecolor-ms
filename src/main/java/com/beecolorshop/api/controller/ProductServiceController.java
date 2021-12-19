package com.beecolorshop.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductServiceController {

	@GetMapping (value="test")
	public ResponseEntity<Object> getProduct() {
		return new ResponseEntity<>("Hello world", HttpStatus.OK);
	}
}
