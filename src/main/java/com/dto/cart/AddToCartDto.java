package com.dto.cart;

public class AddToCartDto {

    private int id;

    private int productid;

    private int quantity;

    public AddToCartDto(int id,int productid,int quantity)
    {

    }

    public int getId()
    {
        return id;
    }
    public void setId()
    {
        this.id = id;
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
}
