package com.example.telecom_billing_system.repository;

import com.example.telecom_billing_system.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}