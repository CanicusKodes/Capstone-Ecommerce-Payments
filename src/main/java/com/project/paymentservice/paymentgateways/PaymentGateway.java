package com.project.paymentservice.paymentgateways;



public interface PaymentGateway {
    String generatePaymentLink(String orderId,Long amount ,String customer_name,String phone_number);
}
