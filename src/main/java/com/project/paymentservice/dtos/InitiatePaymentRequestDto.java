package com.project.paymentservice.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitiatePaymentRequestDto {

    private String order_id;
    private Long amount;
    private String customer_name;
    private String phone_number;
}
