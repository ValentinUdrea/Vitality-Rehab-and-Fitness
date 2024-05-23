package com.codeWithProjects.Vitality.repository;

import com.codeWithProjects.Vitality.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface CouponRepository extends JpaRepository<Coupon, Long> {

    boolean existsByCode(String code);
    //Method that checks if the coupon exists by the code



    Optional<Coupon> findByCode(String code);
}
