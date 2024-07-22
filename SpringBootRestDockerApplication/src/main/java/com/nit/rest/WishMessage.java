package com.nit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wish-api")
public class WishMessage {
	@GetMapping("/wish/{name}")
	public ResponseEntity<String>wishMessage(@PathVariable String name){
		return new ResponseEntity<String>("GoodMorning :: "+name,HttpStatus.OK);
	}

}
