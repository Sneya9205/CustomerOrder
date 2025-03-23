package com.ecommerce.CustomerOrder.Controller;


import com.ecommerce.CustomerOrder.Model.Order;
import com.ecommerce.CustomerOrder.Service.OrderService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Orders API", description = "Endpoints related to orders")
@RequestMapping("/Orders")
public class OrderController {
    @Autowired
    private OrderService service;

    @GetMapping
    public List<Order> getAllOrders() { return service.getAllOrders(); }

    @GetMapping(path = "/{id}")
    public Order getCustomerById(@PathVariable Long id) { return service.getOrderById(id); }

    @PostMapping(path = "addOrder")
    public Order addCustomer(@RequestBody Order order) { return service.addOrder(order); }

    @DeleteMapping(path = "delete/{id}")
    public void deleteCustomer(@PathVariable Long id) { service.deleteOrderById(id); }
}
