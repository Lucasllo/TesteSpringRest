package com.teste.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.entity.User;
import com.teste.repository.UsersRepository;
import com.teste.service.UsersService;

@Service("usersService")
public class UsersServiceImpl implements UsersService{
	
	UsersRepository usersRepository;
	
	@Autowired
	public UsersServiceImpl(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}
	
	@Override
	public List<User> getUsers() {
        return usersRepository.findAll();
    }
    
	@Override
    public User saveUser(User users) {
    	return usersRepository.save(users);
    }
}
