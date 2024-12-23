package com.thedevhorse.cqrswithprojections.domain;

public class Order {

    private Long number;

    private Status status;

    private Order(Long number,
                  Status status) {
        this.number = number;
        this.status = status;
    }

    public static Order create(final Long number,
                               final Status status) {
        return new Order(
                number,
                status
        );
    }

    public Long number() {
        return number;
    }

    public Status status() {
        return status;
    }
}
