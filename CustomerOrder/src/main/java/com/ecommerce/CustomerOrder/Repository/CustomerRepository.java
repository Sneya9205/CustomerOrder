package com.ecommerce.CustomerOrder.Repository;

import com.ecommerce.CustomerOrder.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> { }
