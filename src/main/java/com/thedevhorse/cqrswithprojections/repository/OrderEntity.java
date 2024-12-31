package com.thedevhorse.cqrswithprojections.repository;

import com.thedevhorse.cqrswithprojections.domain.Status;
import jakarta.persistence.*;

@Entity
@Table(name = "Orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long number;

    @Enumerated(EnumType.ORDINAL)
    private Status status;

    public OrderEntity(Long number, Status status) {
        this.number = number;
        this.status = status;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
