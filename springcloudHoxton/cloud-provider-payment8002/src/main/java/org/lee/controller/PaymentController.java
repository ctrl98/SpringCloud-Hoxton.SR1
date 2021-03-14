package org.lee.controller;

import lombok.extern.slf4j.Slf4j;
import org.lee.entity.CommonResult;
import org.lee.entity.Payment;
import org.lee.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("插入成功。。。。。。");
        if (result > 0){
            return new CommonResult(200,"插入成功，server.port= " + serverPort, result);
        }else {
            return new CommonResult(400,"插入失败，server.port= " + serverPort);
        }
    }

    @GetMapping(value = "/payment/selectById/{id}")
    public CommonResult selectById(@PathVariable("id")Long id){
        Payment payment = paymentService.selectById(id);
        if (payment != null){
            return new CommonResult(200,"查询成功，server.port= " + serverPort, payment);
        }else {
            return new CommonResult(400,"查询失败，server.port= " + serverPort);
        }
    }
}
