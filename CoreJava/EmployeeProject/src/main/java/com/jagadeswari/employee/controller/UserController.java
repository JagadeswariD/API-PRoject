package com.jagadeswari.employee.controller;

import java.security.Principal;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

	@GetMapping(path ="/")
	public ResponseEntity<String> welcomeMsg(Principal principal) {
		return ResponseEntity.status(HttpStatus.OK).body("welcome user "+principal.getName());
	}
	
}
