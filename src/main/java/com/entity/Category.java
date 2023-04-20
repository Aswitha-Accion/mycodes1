package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name ="Category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private int id;
    private String categoryName;
    private String description;
    private String imageURL;

    public Category(int id,String categoryName,String description,String imageURL){

    }

    public int getId()
    {
        return id;
    }
    public void setId()
    {
        this.id = id;
    }

    public String getCategoryName()
    {
        return categoryName;
    }
    public void setCategoryName()
    {
        this.categoryName = categoryName;
    }

    public String getDescription()
    {
        return description;
    }
    public void setDescription()
    {
        this.description = description;
    }

    public String getImageURL()
    {
        return imageURL;
    }
    public void setImageURL()
    {
        this.imageURL = imageURL;
    }


}
