package com.teste.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.teste.entity.User;
import com.teste.repository.UsersRepository;

@Component
public class UsersService {
	
	private UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<User> getUsers() {
        return usersRepository.findAll();
    }
    
    public User	 saveUser(User users) {
    	return usersRepository.save(users);
    }

}
