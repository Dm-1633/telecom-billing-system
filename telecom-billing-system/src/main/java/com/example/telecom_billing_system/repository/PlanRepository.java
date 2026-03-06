package com.example.telecom_billing_system.repository;

import com.example.telecom_billing_system.entity.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanRepository extends JpaRepository<Plan, Long> {

}