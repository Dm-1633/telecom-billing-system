package com.example.telecom_billing_system.entity;

import jakarta.persistence.*;

@Entity
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String planName;
    private double callRate;
    private double smsRate;
    private double dataRate;

    public Plan() {
    }

    public Plan(String planName, double callRate, double smsRate, double dataRate) {
        this.planName = planName;
        this.callRate = callRate;
        this.smsRate = smsRate;
        this.dataRate = dataRate;
    }

    // getters and setters
}
