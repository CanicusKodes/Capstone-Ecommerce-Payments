package com.project.paymentservice.controllers;


import com.project.paymentservice.dtos.InitiatePaymentRequestDto;
import com.project.paymentservice.dtos.InitiatePaymentResponseDto;
import com.project.paymentservice.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController()
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/")
    public String initatePayment(@RequestBody InitiatePaymentRequestDto initiatePaymentRequestDto) {
        return paymentService.initiatePayment(initiatePaymentRequestDto.getOrder_id(),initiatePaymentRequestDto.getAmount(),initiatePaymentRequestDto.getCustomer_name(),initiatePaymentRequestDto.getPhone_number());
    }
}
