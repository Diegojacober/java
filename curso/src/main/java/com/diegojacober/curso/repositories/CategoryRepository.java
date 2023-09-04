package com.diegojacober.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegojacober.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
