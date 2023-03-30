package com.repo;

import com.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;



public interface CustomerRepository extends JpaRepository<Customer, Serializable> {

    public  List<Customer> findAll();

    public String addCustomer(Customer customer);

    public String updateCustomer(Customer customer);

    public String updateCustomerById();

    public String deleteCustomer();

    public String deleteCustomerById();

    public Customer getCustomerById(int id);

}
