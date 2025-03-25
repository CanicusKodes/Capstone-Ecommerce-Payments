package com.project.paymentservice.controllers;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/razorpaywebhook")
public class RazorPayWebHookController {

    @PostMapping
    public void razorPayWebHook() {
        System.out.println("RazorPayWebHookController");
    }
}
