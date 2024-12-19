package com.thedevhorse.cqrswithprojections.usecase;

import com.thedevhorse.cqrswithprojections.domain.Order;

public interface OrderInputPort {

    void create(Order order);

    void update(Order order);
}
