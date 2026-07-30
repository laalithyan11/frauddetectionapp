package com.finance.frauddetection.repository;

import com.finance.frauddetection.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository {
    private List<Customer> customers = new ArrayList<>();
    public CustomerRepository() {
        customers.add(new Customer(1, "Rahul", "ACC1001","India"));
        customers.add(new Customer(2, "Rahul", "ACC1002","India"));
        customers.add(new Customer(3, "Rahul", "ACC1003","India"));
    }
    public List<Customer>getCustomers(){
        return customers;
    }
    public Customer getCustomerById(int id) {
        return customers.stream()
                .filter(customer -> customer.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Customer> getAllCustomers() {
        return getCustomerList();
    }

    private static List<Customer> getCustomerList() {
        return List.of();
    }

    public void addCustomer(Customer customer) {

    }

    public void updateCustomer(int id, Customer customer) {
    }

    public void deleteCustomer(int id) {
    }

}
