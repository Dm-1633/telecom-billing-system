package com.example.telecom_billing_system.controller;

import com.example.telecom_billing_system.entity.Billing;
import com.example.telecom_billing_system.entity.Customer;
import com.example.telecom_billing_system.service.BillingService;
import com.example.telecom_billing_system.service.CustomerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/billing")
public class BillingController {

    private final BillingService billingService;
    private final CustomerService customerService;

    public BillingController(BillingService billingService, CustomerService customerService) {
        this.billingService = billingService;
        this.customerService = customerService;
    }

    @PostMapping("/{customerId}")
    public Billing generateBill(
            @PathVariable Long customerId,
            @RequestParam double callMinutes,
            @RequestParam int smsCount,
            @RequestParam double dataUsed
    ) {

        Customer customer = customerService.getCustomer(customerId);

        return billingService.generateBill(customer, callMinutes, smsCount, dataUsed);
    }
}
