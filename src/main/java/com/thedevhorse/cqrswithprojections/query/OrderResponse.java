package com.thedevhorse.cqrswithprojections.query;

import com.thedevhorse.cqrswithprojections.domain.Status;

public interface OrderResponse {
    Long getNumber();

    Status getStatus();
}
