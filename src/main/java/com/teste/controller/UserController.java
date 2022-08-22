package com.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.entity.User;
import com.teste.service.UsersService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UsersService usersService;
	
	@GetMapping("/users")
    public ResponseEntity<?> listUsers() {
        List<User> resource = usersService.getUsers();
        return ResponseEntity.ok(resource);
    }
	
	@PostMapping("/user")
	public ResponseEntity<?> saveUser(@RequestBody User user) {
        User resource = usersService.saveUser(user);
        return ResponseEntity.ok(resource);
    }
}