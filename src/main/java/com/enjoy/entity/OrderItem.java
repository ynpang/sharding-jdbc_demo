package com.enjoy.entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItem {
    private Long orderItemId;
    private Long orderId;
    private Integer userId;
    private Integer status;

}
