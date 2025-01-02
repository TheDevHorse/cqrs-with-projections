package com.thedevhorse.cqrswithprojections.usecase;

import com.thedevhorse.cqrswithprojections.domain.Order;

public interface OrderDaoOutputPort {
    void createOrder(Order order);
}
