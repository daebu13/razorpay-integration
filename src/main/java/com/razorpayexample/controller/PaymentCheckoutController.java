package com.razorpayexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class PaymentCheckoutController {
    @GetMapping("/pays")
    public String showPaymentPage(){
        return "payment";
    }
}
