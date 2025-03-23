package com.ecommerce.CustomerOrder.Service;


import com.ecommerce.CustomerOrder.Exception.ResourceNotFoundException;
import com.ecommerce.CustomerOrder.Model.Order;
import com.ecommerce.CustomerOrder.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> getAllOrders() { return repository.findAll(); }

    public Order getOrderById(Long id) {
        return repository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Order with ID "+Long.toString(id)+" does not exist!!"));
    }

    public Order addOrder(Order order) { return repository.save(order); }

    public void deleteOrderById(Long id) { repository.deleteById(id); }
}
