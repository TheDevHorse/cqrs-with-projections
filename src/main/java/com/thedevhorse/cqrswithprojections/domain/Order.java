package com.thedevhorse.cqrswithprojections.domain;

public class Order {

    private Long number;

    private Order(Long number) {
        this.number = number;
    }

    public static Order create(Long number) {
        return new Order(number);
    }

    public Long getNumber() {
        return number;
    }
}
