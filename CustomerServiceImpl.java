package com.service;

import com.entity.Customer;
import com.repo.CustomerRepository;


import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerService{

    private CustomerService customerService;
    private Object repository;
    public CustomerServiceImpl(CustomerRepository Repository){

        this.repository = repository;
    }

    @Override
    public int addCustomer() {

        return 0;
    }

    @Override
    public String deleteCustomer(int id) {

        repository.deleteById(id);
        return "customer record deleted successfully";
    }

    @Override
    public String updateCustomer(int id) {
        Optional<Customer> customer = repository.findById();

        return null;
    }

    public Customer getCustomerById(int id){
        Customer customer = repository.findById(id).get();
        return customer;
    }

    //@Override
    //public String deleteCustomer(String id) {
     //   repository.toString();
     //   return "customer record deleted with id successfully";
    //}


    @Override
    public String updateCustomer(Customer customer) {
        return "Customer record updated successfully";
    }

    @Override
    public List<Customer> getAllCustomers() {
        return repository.findAll();
        //return "fetching all customers details successfully";

    }

    @Override
    public int getAllCustomersId() {
        return 0;
    }

    @Override
    public int getCustomerById() {
        return 0;
    }

    @Override
    public int deleteCustomerById() {
        return 0;
    }

    @Override
    public int updateCustomerById() {
        return 0;
    }

    @Override
    public int findAllCustomers() {
        return 0;
    }

    @Override
    public List<Customer> findByNameStartsWith(String name) {
        return null;
    }

    @Override
    public List<Customer> findByNameEndsWith(String name) {
        return null;
    }

    @Override
    public String findByNameOrderByName(String name) {
        return "fectching names in order successfully";
    }

    @Override
    public String findByNameOrderByAsc(String name) {
        return "name in ascending order successfully";
    }

    @Override
    public String findByNameOrderByDesc(String name) {
        return "name in descending order successfully";
    }
}
