package com.service;

import com.entity.Customer;
import com.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {


    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerService customerService;
    private Customer customer;
    //private Object repository;


    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    public String addCustomer(){
       String customer1 =  customerRepository.addCustomer(customer);
        return "customer added successfully with id";
    }

    public String updateCustomer() throws CustomerNotFoundException {
       
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

    public String deleteCustomerById()throws CustomerNotFoundException{
        Optional<Customer> customer1 = customerRepository.findById(customer.getId());
        if(customer1.isPresent()){
            return customer.getId()+"details deleted successfully";
        }
        else{
            throw new CustomerNotFoundException();
        }
    }


    public String getCustomerById()throws CustomerNotFoundException {
        Optional<Customer> customer1 = customerRepository.findById(customer.getId());
        if(customer1.isPresent()){
            return customer.getId()+"get details successfully";
        }
        else{
            try {
                throw new CustomerNotFoundException();
            } catch (CustomerNotFoundException e) {
                throw new RuntimeException(e);
            }
        }


    }


}

