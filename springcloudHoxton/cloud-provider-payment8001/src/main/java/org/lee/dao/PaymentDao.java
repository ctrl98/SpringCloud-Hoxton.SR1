package org.lee.dao;

import org.apache.ibatis.annotations.Mapper;
import org.lee.entity.Payment;

@Mapper
public interface PaymentDao {
    // 增删改查。。。。。
    public int create(Payment payment);
}
