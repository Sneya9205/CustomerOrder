package com.ecommerce.CustomerOrder.Service;


import com.ecommerce.CustomerOrder.Exception.ResourceNotFoundException;
import com.ecommerce.CustomerOrder.Model.Customer;
import com.ecommerce.CustomerOrder.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public List<Customer> getAllCustomers() { return repository.findAll(); }

    public Customer getCustomerById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer with ID "+Long.toString(id)+" does not exist!!"));
    }

    public Customer addCustomer(Customer customer) { return repository.save(customer); }

    public void deleteCustomer(Long id) { repository.deleteById(id); }
}
