package com.diegojacober.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegojacober.curso.entities.User;
import com.diegojacober.curso.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;
    
    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(long id) {
        Optional<User> obj = repository.findById(id);
        
        return obj.get();
    }
}
