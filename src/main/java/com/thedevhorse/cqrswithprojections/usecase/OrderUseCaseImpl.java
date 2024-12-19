package com.thedevhorse.cqrswithprojections.usecase;

import com.thedevhorse.cqrswithprojections.domain.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderUseCaseImpl implements OrderInputPort {

    private final OrderDaoOutputPort orderDaoOutputPort;

    public OrderUseCaseImpl(OrderDaoOutputPort orderDaoOutputPort) {
        this.orderDaoOutputPort = orderDaoOutputPort;
    }

    @Override
    public void create(Order order) {
        orderDaoOutputPort.createOrder(order);
    }

    @Override
    public void update(Order order) {
        orderDaoOutputPort.updateOrder(order);
    }
}
