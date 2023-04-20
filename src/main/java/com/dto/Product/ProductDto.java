package com.dto.Product;

public class ProductDto {

    private int id;
    private String name;
    private double price;
    private String description;
    private int categoryId;

    public ProductDto(int id,String name,double price,String description,int categoryId){

    }
    public int getId()
    {
        return id;
    }
    public void setId()
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }
    public void setName()
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }
    public void setPrice()
    {
        this.price = price;
    }

    public String getDescription()
    {
        return description;
    }
    public void setDescription()
    {
        this.description = description;
    }

    public int getCategoryId()
    {
        return categoryId;
    }
    public void setCategoryId()
    {
        this.categoryId = categoryId;
    }

}
