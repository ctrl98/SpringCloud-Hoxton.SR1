package org.lee.service;

import org.apache.ibatis.annotations.Param;
import org.lee.entity.Payment;

public interface PaymentService {
    public int create(Payment payment);

    public Payment selectById(@Param("id") Long id);
}
