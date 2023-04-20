package com.dto.cart;

import java.util.List;

public class CartDto {

    private List<CartItemsDto> cartItems;

    private double totalcost;

    public CartDto(List<CartItemsDto> cartItems,double totalcost){

    }

    public List<CartItemsDto> getCartItems()
    {
        return cartItems;
    }
    public void setCartItems()
    {
        this.cartItems = cartItems;
    }

    public double getTotalcost()
    {
        return totalcost;
    }
    public void setTotalcost()
    {
        this.totalcost = totalcost;
    }
}
