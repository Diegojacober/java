package com.diegojacober.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diegojacober.curso.entities.Order;
import com.diegojacober.curso.services.OrderService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
// https://springdoc.org/v1/#demos
@RestController
@RequestMapping(value = "/orders")
@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@Tag(name = "Orders", description = "Requests for orders in the system")
public class OrderResource {
    
    @Autowired
    private OrderService service;

    @Operation(description = "Get all orders")

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }

    @Operation(description = "Get a specific order by id")
    @GetMapping(value="/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
