package com.example.telecom_billing_system.entity;

import jakarta.persistence.*;

@Entity
public class Billing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double callCharges;
    private double smsCharges;
    private double dataCharges;
    private double totalAmount;

    @ManyToOne
    private Customer customer;

    public Billing() {
    }

    public Long getId() {
        return id;
    }

    public double getCallCharges() {
        return callCharges;
    }

    public void setCallCharges(double callCharges) {
        this.callCharges = callCharges;
    }

    public double getSmsCharges() {
        return smsCharges;
    }

    public void setSmsCharges(double smsCharges) {
        this.smsCharges = smsCharges;
    }

    public double getDataCharges() {
        return dataCharges;
    }

    public void setDataCharges(double dataCharges) {
        this.dataCharges = dataCharges;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}