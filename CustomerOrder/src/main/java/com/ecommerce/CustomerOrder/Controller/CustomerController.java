package com.ecommerce.CustomerOrder.Controller;

import com.ecommerce.CustomerOrder.Model.Customer;
import com.ecommerce.CustomerOrder.Service.CustomerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Customers API", description = "Endpoints related to Customers")
@RequestMapping("/Customers")
public class CustomerController {
    @Autowired
    private CustomerService service;

    @GetMapping
    public List<Customer> getAllCustomers() { return service.getAllCustomers(); }

    @GetMapping(path = "/{id}")
    public Customer getCustomerById(@PathVariable Long id) { return service.getCustomerById(id); }

    @PostMapping(path = "addCustomer")
    public Customer addCustomer(@RequestBody Customer customer) { return service.addCustomer(customer); }

    @DeleteMapping(path = "delete/{id}")
    public void deleteCustomer(@PathVariable Long id) { service.deleteCustomer(id); }
}
