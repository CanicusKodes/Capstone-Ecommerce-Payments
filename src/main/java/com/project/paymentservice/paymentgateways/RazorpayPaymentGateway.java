package com.project.paymentservice.paymentgateways;



public class RazorpayPaymentGateway implements PaymentGateway {
    @Override
    public String generatePaymentLink(String orderId, Long amount) {
        return "";

    }
}
