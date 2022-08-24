package com.teste.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.teste.entity.User;

@Component
public interface UsersService {
	

    public List<User> getUsers();
    
    public User saveUser(User users);

}