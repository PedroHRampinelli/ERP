package com.api.ERP.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public abstract class Product {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private double price;
    @Column(name = "quantity")
    private int quantity;

    protected Product() {
    }

    protected Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}