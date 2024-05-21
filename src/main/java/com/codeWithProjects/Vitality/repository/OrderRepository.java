package com.codeWithProjects.Vitality.repository;

import com.codeWithProjects.Vitality.entity.Order;
import com.codeWithProjects.Vitality.enums.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    Order findByUserIdAndOrderStatus(Long userId, OrderStatus orderStatus);

}
