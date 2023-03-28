package com.service;

import com.entity.Customer;
import com.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;


import java.lang.constant.Constable;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class CustomerServiceImpl{ //implements CustomerService {


    @Autowired
    private CustomerService customerService;
    private CustomerRepository customerRepository;
    private Object repository;

    public CustomerServiceImpl(CustomerRepository Repository) {
        this.repository = repository;
    }
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    public String addCustomer(Customer customer){
       String customer1 =  customerRepository.addCustomer(customer);
        return "customer added successfully with id";
    }

    public String updateCustomer(Customer customer) throws CustomerNotFoundException {
        Optional<Customer> customer1 = customerRepository.findById(customer.getId());
        if(customer1.isPresent())
        {
            return customer.getId()+"details updated successfully";
        }
        else {
            throw new CustomerNotFoundException();
        }
    }
    public String deleteCustomer(){
        customerRepository.deleteCustomerById();
        return "record deletd successfully";
    }

    public String deleteCustomerById(Customer customer)throws CustomerNotFoundException{
        Optional<Customer> customer1 = customerRepository.findById(customer.getId());
        if(customer1.isPresent()){
            return customer.getId()+"details deleted successfully";
        }
        else{
            throw new CustomerNotFoundException();
        }
    }













}

