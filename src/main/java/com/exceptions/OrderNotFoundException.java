package com.exceptions;

import com.entity.Cart;
import org.springframework.security.core.userdetails.User;

import java.util.List;

public class OrderNotFoundException extends IllegalArgumentException{

    public OrderNotFoundException(String msg){
        super(msg);
    }


}
