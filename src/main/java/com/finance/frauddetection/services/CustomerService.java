package com.finance.frauddetection.services;

import com.finance.frauddetection.model.Customer;
import com.finance.frauddetection.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Get all customers
    public List<Customer> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }

    // Get customer by ID
    public Customer getCustomerById(int id) {
        return customerRepository.getCustomerById(id);
    }

    // Add customer
    public Customer addCustomer(Customer customer) {
        customerRepository.addCustomer(customer);
        return customer;
    }

    // Update customer
    public void updateCustomer(int id, Customer customer) {
        customerRepository.updateCustomer(id, customer);
    }

    // Delete customer
    public void deleteCustomer(int id) {
        customerRepository.deleteCustomer(id);
    }
}