package com.codeWithProjects.Vitality.services.admin.adminOrder;

import com.codeWithProjects.Vitality.dto.OrderDto;

import java.util.List;

public interface AdminOrderService {
    List<OrderDto> getAllPlacedOrders();
}
