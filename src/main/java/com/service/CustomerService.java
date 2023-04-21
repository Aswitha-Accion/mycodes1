package com.service;

import com.entity.Order;
import com.entity.User;
import com.exceptions.CustomerNotFoundException;
import com.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CustomerService {

    private CustomerRepository customerRepository;


   @Autowired
   public CustomerService (CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }






    public List<User> getAllCustomers() {
        return customerRepository.findAll();

    }

    public String addUser(User user) {
        customerRepository.save(user);
        return "user added successfully with id";
    }

    public String updateCustomer(User user) throws CustomerNotFoundException {

        Optional<User> customer1 = customerRepository.findById(user.getId());
        if (customer1.isPresent()) {
            return user.getId() + "details updated successfully";
        } else {
            throw new CustomerNotFoundException("Customer Not Found");
        }
    }

    public String deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
        return "record deletd successfully";
    }

    public String deleteCustomerById(Integer id) throws CustomerNotFoundException {
        Optional<User> customer1 = customerRepository.findById(id);
        if (customer1.isPresent()) {
            return customer1.get() + "details deleted successfully";
        } else {
            throw new CustomerNotFoundException("Customer Not Found");
        }

    }


    public String getCustomerById(Integer id) throws CustomerNotFoundException {
        Optional<User> customer1 = customerRepository.findById(id);
        if (customer1.isPresent()) {
            //Order user;
            return customer1.get() + "get details successfully";
        } else {
            throw new CustomerNotFoundException("Customer Not Found");
        }
    }
}


