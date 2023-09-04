package com.diegojacober.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegojacober.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
