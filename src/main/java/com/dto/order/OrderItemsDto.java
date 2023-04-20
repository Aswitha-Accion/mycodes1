package com.dto.order;

public class OrderItemsDto {

    private int orderid;
    private int productid;
    private int quantity;
    private double price;

    public OrderItemsDto(int orderid,int productid,int quantity,double price){

    }

    public int getOrderid()
    {
        return orderid;
    }
    public void setOrderid()
    {
        this.orderid = orderid;
    }

    public int getProductid()
    {
        return productid;
    }
    public void setProductid()
    {
        this.productid = productid;
    }

    public int getQuantity()
    {
        return quantity;
    }
    public void setQuantity()
    {
        this.quantity = quantity;
    }

    public double getPrice()
    {
        return price;
    }
    public void setPrice()
    {
        this.price = price;
    }


}
