package com.codeWithProjects.Vitality.services.admin.coupon;

import com.codeWithProjects.Vitality.entity.Coupon;

import java.util.List;

public interface AdminCouponService {
    Coupon createCoupon(Coupon coupon);
    List<Coupon> getAllCoupons();
}
