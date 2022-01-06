package com.beecolorshop.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/product")
public class ProductServiceController {

	@GetMapping("/")
	public String greeting() {
		return "Hello World";
	}
	
	@GetMapping("/test")
	public ResponseEntity<Object> getProduct() {
		return new ResponseEntity<>("Hello world Test", HttpStatus.OK);
	}
}
