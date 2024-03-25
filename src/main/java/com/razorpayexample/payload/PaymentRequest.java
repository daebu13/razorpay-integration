package com.razorpayexample.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequest {
    private String orderId;
    private double amount;
    private String currency;
    private String receipt;
    private String payment_capture;

    // Getters and setters
}

