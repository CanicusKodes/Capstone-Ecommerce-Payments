package com.project.paymentservice.controllers;


import com.project.paymentservice.dtos.InitiatePaymentRequestDto;
import com.project.paymentservice.dtos.InitiatePaymentResponseDto;
import org.springframework.web.bind.annotation.*;


@RestController()
@RequestMapping("/payments")
public class PaymentController {

    @PostMapping("/{order_id}")
    public InitiatePaymentResponseDto initatePayment(@RequestBody InitiatePaymentRequestDto initiatePaymentRequestDto) {
        return null;
    }
}
