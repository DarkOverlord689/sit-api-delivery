package com.delivery.apidelivery.controller;

import com.delivery.apidelivery.entities.Food;
import com.delivery.apidelivery.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class OrderController {
    @Autowired
    private OrderService orderService;
/*
    @GetMapping("/foods")
    public ResponseEntity<List<Food>> getAllFoods(){
       // return ResponseEntity.ok(this.orderService.getAllFoods()); // no test aun
    }
*/
}
