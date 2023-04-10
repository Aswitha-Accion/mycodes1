package com.entity;

public class ShoppingCart {

    public int id;
    public String name;
    public String productname;
    public int productquantity;
    public float amount;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getProductname() {
        return productname;
    }
    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getProductquantity() {
        return productquantity;
    }
    public void setProductquantity(int productquantity) {
        this.productquantity = productquantity;
    }

    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
}
