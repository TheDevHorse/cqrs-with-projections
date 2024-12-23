package com.thedevhorse.cqrswithprojections.command;

import com.thedevhorse.cqrswithprojections.domain.Order;
import com.thedevhorse.cqrswithprojections.usecase.OrderInputPort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderCommandController {

    private final OrderInputPort orderInputPort;

    public OrderCommandController(OrderInputPort orderInputPort) {
        this.orderInputPort = orderInputPort;
    }

    @PostMapping
    public void createOrder(@RequestBody OrderRequest orderRequest) {
        orderInputPort.create(
                mapToOrder(orderRequest)
        );
    }

    @PutMapping
    public void updateOrder(@RequestBody OrderRequest orderRequest) {
        orderInputPort.update(
                mapToOrder(orderRequest)
        );
    }

    private Order mapToOrder(OrderRequest orderRequest) {
        return Order.create(
                orderRequest.number(),
                orderRequest.status()
        );
    }
}
