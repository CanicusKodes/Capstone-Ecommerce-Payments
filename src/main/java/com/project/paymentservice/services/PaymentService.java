package com.project.paymentservice.services;


import com.project.paymentservice.paymentgateways.PaymentGateway;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service
public class PaymentService {

    private PaymentGateway paymentGateway;

    PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String initiatePayment(String orderId, Long amount,String customerName, String phone_number) {
       return paymentGateway.generatePaymentLink(orderId,amount,customerName,phone_number);
    }
}
