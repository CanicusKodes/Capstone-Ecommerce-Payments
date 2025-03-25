package com.project.paymentservice.paymentgateways;

import com.razorpay.PaymentLink;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.json.JSONObject;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class RazorpayPaymentGateway implements PaymentGateway {


    private RazorpayClient razorpayClient;

    RazorpayPaymentGateway(RazorpayClient razorpayClient) {
        this.razorpayClient = razorpayClient;
    }

    @Override
    public String generatePaymentLink(String orderId, Long amount, String customer_name, String phone_number) {
        try {
            JSONObject paymentLinkRequest = new JSONObject();
            paymentLinkRequest.put("amount",amount);
            paymentLinkRequest.put("currency","INR");
            paymentLinkRequest.put("accept_partial",false);
//            paymentLinkRequest.put("first_min_partial_amount",100);
            paymentLinkRequest.put("expire_by",1742825400);
            paymentLinkRequest.put("reference_id","TS1989");
            paymentLinkRequest.put("description","Payment for policy no #23456");
            JSONObject customer = new JSONObject();
            customer.put("name",customer_name);
            customer.put("contact", phone_number);
            customer.put("email","gaurav.kumar@example.com");
            paymentLinkRequest.put("customer",customer);
            JSONObject notify = new JSONObject();
            notify.put("sms",true);
            notify.put("email",true);
            paymentLinkRequest.put("notify",notify);
            paymentLinkRequest.put("reminder_enable",true);
            JSONObject notes = new JSONObject();
            notes.put("policy_name","Jeevan Bima");
            paymentLinkRequest.put("notes",notes);
            paymentLinkRequest.put("callback_url","https://example-callback-url.com/");
            paymentLinkRequest.put("callback_method","get");

            PaymentLink payment = razorpayClient.paymentLink.create(paymentLinkRequest);

            return payment.toString();
        } catch (RazorpayException e) {
            throw new RuntimeException(e);
        }
    }
}
