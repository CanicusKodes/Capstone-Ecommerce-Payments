package com.project.paymentservice.configs;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class PaymentGatewayConfig {



    @Value("${razorpay.key.id}")
    String apiKey;

    @Value("${razorpay.key.secret}")
    String apiSecret;

    @Bean
    public RazorpayClient getRazorpayClient() throws RazorpayException {
        return new RazorpayClient(apiKey,apiSecret);
    }


}
