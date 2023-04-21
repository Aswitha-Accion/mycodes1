package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "User")

public class User {

    //int id, String name, String email, @Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    public Integer userid;

    @Column
    public int age;

    @Column
    public String name;

    @Column
    private String email;

    //@Column
    //private String username;

    @Column
    private String password;

    private String address;

    public User() {
    }

    public User(int id, int age, String name, String email, String username, String password) {
    }

    public static String deleteUser(User user) {
        return null;
    }

    public int getId() {
        return userid;
    }

    public void setId() {
        this.userid = userid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress() {
        this.address = address;
    }


    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = email;
    }

    //public String getUsername() {
    //    return username;
    //}

    //public void setUsername() {
    //    this.username = username;
    //}

    public String getPassword() {
        return password;
    }

    public void setPassword() {
        this.password = password;
    }

    public String updateUser(User user) {
        return null;
    }

    public String addUser(User user) {
        return null;
    }

}
