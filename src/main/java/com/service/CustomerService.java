package com.service;

import com.entity.Customer;
//import com.entity.CustomerNotFoundException;

import java.util.List;

public interface CustomerService {


    public int addCustomer();

    public List<Customer> getAllCustomers();

    public Customer getCustomerById(int id);

    public String updateCustomer()throws CustomerNotFoundException;

    public String updateCustomer(String  id);

    public String deleteCustomer(int id);

    public String updateCustomer(int id);

    public String updateCustomer(Customer customer) throws CustomerNotFoundException;

    public String deleteCustomer(Customer customer) ;

    String deleteCustomer(String id);


















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
