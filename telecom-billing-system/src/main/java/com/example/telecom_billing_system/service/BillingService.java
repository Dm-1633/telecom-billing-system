package com.example.telecom_billing_system.service;

import com.example.telecom_billing_system.entity.Billing;
import com.example.telecom_billing_system.entity.Customer;
import com.example.telecom_billing_system.repository.BillingRepository;
import org.springframework.stereotype.Service;

@Service
public class BillingService {

    private final BillingRepository repository;

    public BillingService(BillingRepository repository) {
        this.repository = repository;
    }

    public Billing generateBill(Customer customer, double callMinutes, int smsCount, double dataUsed) {

        double callCharges = callMinutes * 1;
        double smsCharges = smsCount * 0.5;
        double dataCharges = dataUsed * 2;

        double totalAmount = callCharges + smsCharges + dataCharges;

        Billing bill = new Billing();
        bill.setCustomer(customer);
        bill.setCallCharges(callCharges);
        bill.setSmsCharges(smsCharges);
        bill.setDataCharges(dataCharges);
        bill.setTotalAmount(totalAmount);

        return repository.save(bill);
    }
}