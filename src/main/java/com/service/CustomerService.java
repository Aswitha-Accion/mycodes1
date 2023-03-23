package com.service;

import com.entity.Customer;
//import com.entity.CustomerNotFoundException;

import java.util.List;

public interface CustomerService {

    public int addCustomer();

    //String deleteCustomer(String id);

    public String deleteCustomer(Customer customer);

    String deleteCustomer(String id);

    public String updateCustomer();

    public String getAllCustomers();

    public int getAllCustomersId();

    public int getCustomerById();

    public int deleteCustomerById();

    public int updateCustomerById();

    public int findAllCustomers();

    public List<Customer> findByNameStartsWith(String name);

    public List<Customer> findByNameEndsWith(String name);

    public String findByNameOrderByName(String name);

    public String findByNameOrderByAsc(String name);

    public String findByNameOrderByDesc(String name);





}
