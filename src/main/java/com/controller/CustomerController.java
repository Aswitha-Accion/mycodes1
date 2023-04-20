package com.controller;

import com.entity.User;
import com.entity.Product;
import com.exceptions.CustomerNotFoundException;
import com.service.CustomerService;
import com.service.OrderService;
import com.service.ProductService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.userdetails.User;
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




    @PostMapping(value = "/getAllproducts" , consumes ={MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Product>> getAllProducts(@PathVariable Integer id){
        List<Product> productList = ProductService.getAllProducts(id);
        return new ResponseEntity(productList,HttpStatus.OK);
    }

    //@PostMapping(value = "/getproduct/{id}",consumes = {MediaType.APPLICATION_JSON_VALUE})
    //public ResponseEntity getProductById(@PathVariable Integer id){
     //   List<Product> product = ProductService.ge(id);
     //   return new ResponseEntity<>(HttpStatus.OK);
    //}

    @PostMapping(value = "/getorder",consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity getorder(@PathVariable Integer id,HttpServletRequest request){
        orderService.getOrder(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping(value = "/getOrder/{id}",consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity getorder1(@PathVariable Integer id,HttpServletRequest request) {
       orderService.getOrder(id);
        return new ResponseEntity(HttpStatus.OK);
    }


    @PostMapping(value = "/create", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> addCustomer(@RequestBody User user, HttpServletRequest request) {
        String msg = user.addUser(user);
        return new ResponseEntity<>(msg, HttpStatus.CREATED);
    }

    @GetMapping(value = "/id", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> getCustomerById(@PathVariable Integer id, HttpServletRequest request) throws CustomerNotFoundException {
        System.out.println(request);
        String msg = customerService.getCustomerById(id);
        if (msg != null) {
            //return new ResponseEntity<String>(String.valueOf(user), HttpStatus.OK);
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<String>(HttpStatus.OK);
            //return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }

    }

    @PutMapping(value = "/update", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> updateUser(@RequestBody User user) {
        try {
            String msg = user.updateUser(user);
            return new ResponseEntity<>(msg, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
        }
    }

    @DeleteMapping(value = "/delete", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> deleteUser(@RequestBody User user) {
        try {
            String msg = User.deleteUser(user);
            return new ResponseEntity<>(msg, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
        }
    }

    @PostMapping(value = "/addUser", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> addUser(@RequestBody User user) {
        String msg = customerService.addUser(user);
        if (user != null) {
            return new ResponseEntity<String>(String.valueOf(user), HttpStatus.OK);
        } else {
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(value = "/delet{id}", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> getUserById(@PathVariable Integer id) {
        try {
            String msg = String.valueOf(customerService.deleteCustomerById(id));
            return new ResponseEntity<>(msg, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping(value = "/update{id}", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> updateUserById(@PathVariable User id) {
        try {
            String msg = customerService.updateCustomer(id);
            return new ResponseEntity<>(msg, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
        }
    }

    @GetMapping(value = "/getUser", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<User>> getUsers(@PathVariable User user) {
        List<User> allCustomers = customerService.getAllCustomers();
        return new ResponseEntity<List<User>>(allCustomers, HttpStatus.OK);
    }

    @GetMapping(value = "/getCustomer{id}", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> getCustomerById(@PathVariable Integer id) throws CustomerNotFoundException {
        String Customer = String.valueOf(customerService.getCustomerById(id));
        return new ResponseEntity<String>(Customer,HttpStatus.OK);
    }
}
        //getAllCustomers, getCustomerById, updateCustomer, addcustomer, deletecustomer, deletecustometById