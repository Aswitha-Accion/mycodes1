package com.controller;

import com.entity.Customer;
import com.entity.Order;
import com.entity.Product;
import com.service.CustomerNotFoundException;
import com.service.CustomerService;
import com.service.OrderService;
import com.service.ProductService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    @Autowired
    private OrderService orderService;
    @Autowired
    private ProductService ProductService;


    private int id;

    @PostMapping(value = "/getAllproducts" , consumes ={MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Product>> getAllProducts(){
        List<Product> productList = ProductService.getAllProducts(id);
    return new ResponseEntity(productList,HttpStatus.OK);
    }

    @PostMapping(value = "/getproduct/{id}",consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity getProductDetails(@RequestBody HttpServletRequest request){
        List<Product> product = ProductService.getAllProducts(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(value = "/getorder",consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity getorderdetails(@RequestBody HttpServletRequest request){
        Order order = orderService.getOrderDetails(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping(value = "/getOrder/{id}",consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity getorderdetails1(@RequestBody HttpServletRequest request) {
        Order order = orderService.getOrderDetails(id);
        return new ResponseEntity(HttpStatus.OK);
    }


    @PostMapping(value = "/create", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> addCustomer(@RequestBody Customer customer, HttpServletRequest request) {
        String msg = customer.addCustomer(customer);
        return new ResponseEntity<>(msg, HttpStatus.CREATED);
    }

    @GetMapping(value = "/id", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> getCustomerById(@PathVariable("id") Customer customer, HttpServletRequest request) throws CustomerNotFoundException {
        System.out.println(request);
        String customer1 = String.valueOf(customerService.getCustomerById());
        if (customer != null) {
            return new ResponseEntity<String>(String.valueOf(customer), HttpStatus.OK);
        } else {
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }

    }

    @PutMapping(value = "/update", consumes = {MediaType.APPLICATION_JSON_VALUE})
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
        String msg = customerService.addCustomer();
        if (customer != null) {
            return new ResponseEntity<String>(String.valueOf(customer), HttpStatus.OK);
        } else {
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(value = "/delet{id}", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> getCustomerById(@PathVariable Integer id) {
        try {
            String msg = String.valueOf(customerService.deleteCustomerById());
            return new ResponseEntity<>(msg, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping(value = "/update{id}", consumes = {MediaType.APPLICATION_JSON_VALUE})
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
    public ResponseEntity<String> getCustomerById(@PathVariable Customer customer) throws CustomerNotFoundException {
        String Customer = String.valueOf(customerService.getCustomerById());
        return new ResponseEntity<String>(Customer,HttpStatus.OK);
    }
}
        //getAllCustomers, getCustomerById, updateCustomer, addcustomer, deletecustomer, deletecustometById