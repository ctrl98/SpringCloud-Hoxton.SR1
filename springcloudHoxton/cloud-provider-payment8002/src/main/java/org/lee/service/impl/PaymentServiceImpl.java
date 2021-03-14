package org.lee.service.impl;

import org.lee.dao.PaymentDao;
import org.lee.entity.Payment;
import org.lee.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    @Override
    public Payment selectById(Long id) {
        return paymentDao.selectById(id);
    }
}
