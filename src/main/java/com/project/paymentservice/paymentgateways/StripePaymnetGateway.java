package com.project.paymentservice.paymentgateways;

public class StripePaymnetGateway implements PaymentGateway {
    @Override
    public String generatePaymentLink(String orderId, Long amount) {
        return "";
    }
}
