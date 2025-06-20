package com.payment.stripe_payment.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StripeResponse {

    private String status;
    private String message;
    private String sessionId;
    private String sessionUrl;
}