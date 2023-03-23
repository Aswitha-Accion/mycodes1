package com.controller;

import com.entity.Customer;
import com.service.CustomerService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
@Validated
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    private int id;

    @PostMapping(value = "/create", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> addCustomer(@RequestBody Customer customer, HttpServletRequest request) {
        String msg = customer.addCustomer(customer);
        return new ResponseEntity<>(msg, HttpStatus.CREATED);
    }

    @PostMapping(value = "/id", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> getCustomerById(@PathVariable("id") Customer customer, HttpServletRequest request) {
        System.out.println(request);
        String customer1 = String.valueOf(customerService.getCustomerById());
        if (customer != null) {
            return new ResponseEntity<String>(String.valueOf(customer), HttpStatus.OK);
        } else {
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping(value = "/update", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> updateCustomer(@RequestBody Customer customer) {
        try {
            String msg = customer.updateCustomer(customer);
            return new ResponseEntity<>(msg, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
        }
    }

    @DeleteMapping(value = "/delete", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> deleteCustomer(@RequestBody Customer customer) {
        try {
            String msg = customer.deleteCustomer(customer);
            return new ResponseEntity<>(msg, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
        }
    }

    @PostMapping(value = "/addcustomer", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> addcustomer(@RequestBody Customer customer) {
        int msg = customerService.addCustomer();
        if (customer != null) {
            return new ResponseEntity<String>(String.valueOf(customer), HttpStatus.OK);
        } else {
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value = "/delet{id}", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> getCustomerById(@PathVariable Integer id) {
        try {
            String msg = String.valueOf(customerService.deleteCustomerById());
            return new ResponseEntity<>(msg, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value = "/update{id}", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> updateCustomerById(@PathVariable Integer custId) {
        try {
            String msg = customerService.updateCustomer();
            return new ResponseEntity<>(msg, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
        }
    }

    @GetMapping(value = "/getCustomer", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Customer>> getCustomers(@PathVariable Customer customer) {
        List<Customer> allCustomers = customerService.getAllCustomers();
        return new ResponseEntity<List<Customer>>(allCustomers, HttpStatus.OK);
    }

    @GetMapping(value = "/getCustomer{id}", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> getCustomerById(@PathVariable Customer customer) {
        String Customer = String.valueOf(customerService.getCustomerById());
        return new ResponseEntity<String>(Customer,HttpStatus.OK);
    }
}
