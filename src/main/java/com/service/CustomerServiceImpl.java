package com.service;

import com.entity.Customer;
import com.repo.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{

    private CustomerService customerService;
    private Object repository;
    public CustomerServiceImpl(CustomerRepository Repository){

        this.repository = repository;
    }
    public CustomerServiceImpl(){


    }
    @Override
    public int addCustomer() {

        return 0;
    }

    @Override
    public String deleteCustomer(Customer customer)  {
        return "customer record deleted successfully";
    }

    @Override
    public String deleteCustomer(String id) {
        repository.toString();
        return "customer record deleted with id successfully";
    }


    @Override
    public String updateCustomer()throws CustomerNotFoundException {
        <Optional>  

        return "Customer record updated successfully";
    }

    @Override
    public String getAllCustomers() {
        return "fetching all customers successfully";

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
