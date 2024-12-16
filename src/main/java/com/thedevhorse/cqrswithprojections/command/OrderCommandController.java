package com.thedevhorse.cqrswithprojections.command;

import com.thedevhorse.cqrswithprojections.usecase.OrderInputPort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderCommandController {

    private final OrderInputPort orderInputPort;

    public OrderCommandController(OrderInputPort orderInputPort) {
        this.orderInputPort = orderInputPort;
    }

    @PostMapping
    public void createOrder() {
        orderInputPort.create(null);
    }

    @PutMapping
    public void updateOrder() {
        orderInputPort.update(null);
    }

    @DeleteMapping
    public void deleteOrder() {
        orderInputPort.delete(null);
    }
}
