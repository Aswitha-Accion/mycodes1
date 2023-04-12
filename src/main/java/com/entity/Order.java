package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.antlr.v4.runtime.misc.LogManager;

import java.awt.*;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String orderdescription;
    private Customer customer;
    private List cartItems;

    public Order() {

    }

    public Order(int id, String orderdescription, Customer customer, List cartItems) {

    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getorderdescription() {
        return orderdescription;
    }

    public void setorderdescription() {
        this.orderdescription = orderdescription;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer() {
        this.customer = customer;
    }

    public List getCartItems() {
        return cartItems;
    }

    public void SetcartItems() {
        this.cartItems = cartItems;
    }
}
