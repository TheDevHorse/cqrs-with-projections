package com.thedevhorse.cqrswithprojections.repository;

import jakarta.persistence.*;

@Entity
@Table(name = "Order")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long number;

    public OrderEntity(Long number) {
        this.number = number;
    }

    public OrderEntity() {

    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
