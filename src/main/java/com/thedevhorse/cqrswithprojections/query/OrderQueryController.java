package com.thedevhorse.cqrswithprojections.query;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class OrderQueryController {

    @GetMapping
    public OrderResponse getOrders() {
        return null;
    }
}
