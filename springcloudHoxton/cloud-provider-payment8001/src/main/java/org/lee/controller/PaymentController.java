package org.lee.controller;

import lombok.extern.slf4j.Slf4j;
import org.lee.entity.CommonResult;
import org.lee.entity.Payment;
import org.lee.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("插入成功。。。。。。");
        if (result > 0){
            return new CommonResult(200,"成功", result);
        }else {
            return new CommonResult(400,"失败");
        }
    }
}
