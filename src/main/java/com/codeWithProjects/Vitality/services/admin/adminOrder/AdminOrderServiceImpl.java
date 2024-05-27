package com.codeWithProjects.Vitality.services.admin.adminOrder;

import com.codeWithProjects.Vitality.dto.OrderDto;
import com.codeWithProjects.Vitality.entity.Order;
import com.codeWithProjects.Vitality.enums.OrderStatus;
import com.codeWithProjects.Vitality.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AdminOrderServiceImpl implements AdminOrderService{

    private final OrderRepository orderRepository;

    public List<OrderDto> getAllPlacedOrders(){
        List<Order> orderList = orderRepository.findAllByOrderStatusIn(List.of(OrderStatus.Placed, OrderStatus.Shipped, OrderStatus.Delivered));
        return orderList.stream().map(Order::getOrderDto).collect(Collectors.toList());
    }
}
