package org.lee.controller;

import lombok.extern.slf4j.Slf4j;
import org.lee.entity.CommonResult;
import org.lee.entity.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {

//    private static final String PAYMENT_URL = "http://localhost:8001";
    private static final String PAYMENT_URL = "http://CLOUD-PAYMENT.SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping(value = "/consumer/payment/selectById/{id}")
    public CommonResult selectById(@PathVariable("id")Long id){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/selectById/" + id, CommonResult.class);
    }
}
