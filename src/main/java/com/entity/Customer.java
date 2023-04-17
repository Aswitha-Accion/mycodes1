package com.entity;


import jakarta.persistence.*;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.io.Serializable;

@Entity
@Table(name = "Customer")


public class Customer {

    //int id, String name, String email
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    public int custid;

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
    @Column
    private int addCustomer;
    @Column
    private int updateCustomer;
    @Column
    private int deleteCustomer;

    public Customer() {
    }

    public Customer(int id,int age, String name, String email, String username, String password) {
    }

    public int getId(){
        return custid;
    }
    public void setId(){
        this.custid = custid;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(){
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

    public String addCustomer(Customer customer) {
        this.addCustomer = addCustomer;
        return addCustomer(customer);
    }

    public String updateCustomer(Customer customer) {
        this.updateCustomer = updateCustomer;
        return updateCustomer(customer);
    }


    public String deleteCustomer(Customer customer) {
        //this.deleteCustomer = deleteCustomer(deleteCustomer);
        return deleteCustomer(customer);
    }
}
