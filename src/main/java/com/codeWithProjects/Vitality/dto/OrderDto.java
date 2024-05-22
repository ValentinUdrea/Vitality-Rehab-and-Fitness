package com.codeWithProjects.Vitality.dto;

import com.codeWithProjects.Vitality.entity.CartItems;
import com.codeWithProjects.Vitality.entity.User;
import com.codeWithProjects.Vitality.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
public class OrderDto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderDescription;

    private Date date;

    private Long amount;

    private String address;

    private String payment;

    private OrderStatus orderStatus;

    private Long totalAmount;

    private Long discount;

    private UUID trackingId;

    private String userName;


    private List<CartItemsDto> cartItems;


}
