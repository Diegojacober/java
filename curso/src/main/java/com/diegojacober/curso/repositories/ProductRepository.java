package com.diegojacober.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegojacober.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
