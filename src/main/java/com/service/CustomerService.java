package com.service;

import com.entity.User;

import java.util.List;

public class CustomerService {

    //@Autowired
    // private CustomerRepository customerRepository;
    //@Autowired
    //private CustomerService customerService;
    // @Autowired
    //private Customer customer;



    public List<User> getAllCustomers(){
        //return customerRepository.findAll();
        return null;
    }

    public String addUser(){
        //String customer1 =  customerRepository.save(customer);
        return "user added successfully with id";
    }

    public String updateCustomer() throws CustomerNotFoundException {

        //Optional<Customer> customer1 = customerRepository.findById(customer.getId());
        //if(customer1.isPresent())
        //{
        //  return customer.getId()+"details updated successfully";
        //}
        //else {
        //   throw new CustomerNotFoundException();
        // }

        return null;
    }
    public String deleteCustomer(){
        //customerRepository.deleteCustomerById();
        return "record deletd successfully";
    }

    public String deleteCustomerById()throws CustomerNotFoundException{
        //Optional<Customer> customer1 = customerRepository.findById(customer.getId());
        //if(customer1.isPresent()){
        //    return customer.getId()+"details deleted successfully";
        //}
        //else{
        //   throw new CustomerNotFoundException();
        //}
        return null;
    }


    public String getCustomerById()throws CustomerNotFoundException {
        //Optional<Customer> customer1 = customerRepository.findById(customer.getId());
        //if(customer1.isPresent()){
        //   return customer.getId()+"get details successfully";
        //}
        // else{
        //     try {
        //        throw new CustomerNotFoundException();
        //    } catch (CustomerNotFoundException e) {
        //       throw new RuntimeException(e);
        //   }
        return null;
    }


}


