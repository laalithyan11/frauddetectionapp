package com.finance.frauddetection.controllers;

import com.finance.frauddetection.model.Customer;
import com.finance.frauddetection.services.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    // GET /api/customers
    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    // GET /api/customers/{id}
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @PutMapping("/{id}")
    public String updateCustomer(@PathVariable int id,
                                 @RequestBody Customer customer) {
        customerService.updateCustomer(id, customer);
        return "Customer updated successfully";
    }

    // DELETE /api/customers/{id}
    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable int id) {
        customerService.deleteCustomer(id);
        return "Customer deleted successfully";
    }
}