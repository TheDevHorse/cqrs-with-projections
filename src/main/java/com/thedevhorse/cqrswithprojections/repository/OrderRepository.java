package com.thedevhorse.cqrswithprojections.repository;


import com.thedevhorse.cqrswithprojections.query.OrderResponse;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface OrderRepository extends Repository<OrderEntity, Long> {

    void save(OrderEntity orderEntity);

    Optional<OrderResponse> findByNumber(Long number);
}
