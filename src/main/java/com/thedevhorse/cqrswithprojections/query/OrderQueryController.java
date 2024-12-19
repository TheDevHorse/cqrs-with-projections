package com.thedevhorse.cqrswithprojections.query;

import com.thedevhorse.cqrswithprojections.repository.OrderRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderQueryController {

    private final OrderRepository orderRepository;

    public OrderQueryController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/{number}")
    public OrderResponse getOrders(@PathVariable Long number) {
        return orderRepository.findByNumber(number)
                .orElseThrow(() -> new RuntimeException("Order not found"));
    }
}
