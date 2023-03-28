package com.service;

import com.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
//import com.entity.CustomerNotFoundException;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();

    public String updateCustomer();

    public String getCustomerById();

    public String deleteCustomerById();

    public String addCustomer();
}






