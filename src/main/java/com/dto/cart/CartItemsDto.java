package com.dto.cart;

public class CartItemsDto {

    private int id;

    private int quantity;

    private String product;

    public CartItemsDto(int id,int quantity,String product){

    }

    public int getId()
    {
        return id;
    }
    public void setId()
    {
        this.id = id;
    }

    public int getQuantity()
    {
        return quantity;
    }
    public void setQuantity()
    {
        this.quantity = quantity;
    }

    public String getProduct()
    {
        return product;
    }
    public void setProduct()
    {
        this.product = product;
    }
}
