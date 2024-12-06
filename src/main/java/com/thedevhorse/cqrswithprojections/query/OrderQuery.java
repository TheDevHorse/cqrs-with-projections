package com.thedevhorse.cqrswithprojections.query;

import com.thedevhorse.cqrswithprojections.repository.OrderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = OrderResponse.class)
public interface OrderQuery extends CrudRepository<OrderEntity, Long> {

}
