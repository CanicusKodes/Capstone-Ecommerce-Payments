package com.project.paymentservice.paymentgateways;



public interface PaymentGateway {
    String generatePaymentLink(String orderId,Long amount);
}
