package com.exceptions;

public class CustomerNotFoundException extends IllegalArgumentException{

    public CustomerNotFoundException(String msg){

        super(msg);
    }
}
