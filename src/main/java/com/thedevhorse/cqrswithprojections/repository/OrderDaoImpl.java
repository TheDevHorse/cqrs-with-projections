package com.thedevhorse.cqrswithprojections.repository;

import com.thedevhorse.cqrswithprojections.domain.Order;
import com.thedevhorse.cqrswithprojections.usecase.OrderDaoOutputPort;
import org.springframework.stereotype.Component;

@Component
public class OrderDaoImpl implements OrderDaoOutputPort {

    private final OrderRepository orderRepository;

    public OrderDaoImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void createOrder(Order order) {
        orderRepository.save(
                mapOrderToEntity(order)
        );
    }

    @Override
    public void updateOrder(Order order) {
        // Update order in database
    }

    private OrderEntity mapOrderToEntity(Order order) {
        return new OrderEntity(
                order.number()
        );
    }
}
