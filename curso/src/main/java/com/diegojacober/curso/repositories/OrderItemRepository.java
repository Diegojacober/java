package com.diegojacober.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegojacober.curso.entities.OrderItem;
//@Repository //não é necessário pq ja esta extendendo o Jpa repository que ja está registrado
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    
}
