package com.thedevhorse.cqrswithprojections.query;

import com.thedevhorse.cqrswithprojections.repository.OrderEntity;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "OrderResponse", types = { OrderEntity.class })
public interface OrderResponse {


}
