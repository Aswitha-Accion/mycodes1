package com.entity;

import jakarta.persistence.*;

import java.util.Date;

import static org.springframework.data.jpa.domain.AbstractAuditable_.createdDate;

@Entity
@Table(name = "Cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date createdDate;

    private Product product;

    private User user;

    private int quantity;

    public Cart(int id, Date createdDate, Product product, User user, int quantity) {

    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser() {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct() {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity() {
        this.quantity = quantity;
    }
}

