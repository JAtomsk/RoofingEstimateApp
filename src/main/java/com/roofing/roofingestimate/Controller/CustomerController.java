package com.roofing.roofingestimate.Controller;
import com.roofing.roofingestimate.model.Customer;
import com.roofing.roofingestimate.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;


import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController // Handles we requests and returns data hot html pages
@RequestMapping("/customers")
public class CustomerController {


    //@Autowired tells Spring Boot to automatically give you an instance of CustomerRepository
    //You’ll use this to save and get customers from the database
    @Autowired
    private CustomerRepository customerRepository;


    //All the URLs in this controller will start with /customers

    //@PostMapping says this method handles POST requests
    // @RequestBody means Spring will take JSON from the request and convert it into a Customer object
    //You calculate the estimate before saving

    @PostMapping
    public Customer createCustomer(@Valid @RequestBody Customer customer){
        double estimate = customer.getRoofSizeInSquares() * customer.getPricePerSquare();
        customer.setTotalEstimate(estimate);

        return customerRepository.save(customer);

    }

    //@GetMapping says this method handles GET requests
    //It returns a list of all customers in the database

    @GetMapping
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

}
