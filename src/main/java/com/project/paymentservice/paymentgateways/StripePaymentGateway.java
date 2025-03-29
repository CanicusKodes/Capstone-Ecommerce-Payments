package com.project.paymentservice.paymentgateways;

public class StripePaymentGateway implements PaymentGateway {

    @Override
    public String generatePaymentLink(String orderId, Long amount, String customer_name, String phone_number) {
        return "";
    }
}
