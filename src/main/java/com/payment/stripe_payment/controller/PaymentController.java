//package com.payment.stripe_payment.controller;
//
//import com.payment.stripe_payment.dto.PaymentRequest;
//import com.stripe.exception.StripeException;
//import com.stripe.model.Charge;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.Map;
//import com.stripe.Stripe;
//import com.stripe.model.Charge;
//import com.stripe.exception.StripeException;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Controller
//@RequestMapping("/payment")
//public class PaymentController {
//
//    @Value("${stripe.secret.key}")
//    private String stripeSecretKey;
//
//    @GetMapping
//    public String showPaymentPage() {
//        return "payment";  // Thymeleaf template 'payment.html'
//    }
//
//    @PostMapping("/charge")
//    @ResponseBody
//    public String charge(@RequestBody PaymentRequest request) throws StripeException {
//        Stripe.apiKey = stripeSecretKey;
//
//        // Create the charge with Stripe API
//        Map<String, Object> params = new HashMap<>();
//        params.put("amount", request.getAmount());
//        params.put("currency", request.getCurrency());
//        params.put("description", request.getDescription());
//        params.put("receipt_email", request.getReceiptEmail());
//        params.put("source", request.getToken());  // Token from the frontend
//
//        Charge charge = Charge.create(params);
//
//        return "Payment successful, Charge ID: " + charge.getId();
//    }
//}
