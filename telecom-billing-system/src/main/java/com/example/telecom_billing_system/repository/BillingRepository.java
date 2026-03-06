package com.example.telecom_billing_system.repository;

import com.example.telecom_billing_system.entity.Billing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}