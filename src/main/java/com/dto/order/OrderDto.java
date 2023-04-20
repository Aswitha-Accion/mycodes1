package com.dto.order;

public class OrderDto {

    private int id;
    private int userid;

    public OrderDto(int id,int userid){

    }

    public int getId()
    {
        return id;
    }
    public void setId()
    {
        this.id = id;
    }

    public int getUserid()
    {
        return userid;
    }
    public void setUserid()
    {
        this.userid = userid;
    }
}
