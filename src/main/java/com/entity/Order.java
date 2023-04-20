package com.entity;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.LogManager;

import java.awt.*;

@Entity
@Table(name = "Order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String orderdescription;
    private User user;
    private List cartItems;

    public Order() {

    }

    public Order(int id, String orderdescription, User user, List cartItems) {

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

    public User getUser() {
        return user;
    }

    public void setUser() {
        this.user = user;
    }

    public List getCartItems() {
        return cartItems;
    }

    public void SetcartItems() {
        this.cartItems = cartItems;
    }
}
