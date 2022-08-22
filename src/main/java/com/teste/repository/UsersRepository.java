package com.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.entity.User;

public interface UsersRepository extends JpaRepository<User, Integer>{}
