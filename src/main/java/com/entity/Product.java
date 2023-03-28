package com.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String productname;
    private int productquantity;
    private float productprice;

    public Product(){

    }

    public Product(int id,String productname,int productquantity,float price){

    }

    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }

    public String getProductname(){
        return productname;
    }
    public void setProductname(){
        this.productname = productname;
    }

    public int getProductquantity(){
        return productquantity;
    }
    public void setProductquantity(){
        this.productquantity = productquantity;
    }

    public float getproductprice(){
        return productprice;
    }
    public void setproductprice(){
        this.productprice = productprice;
    }


}
