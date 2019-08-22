package com.enjoy.entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private Long orderId;
    private Integer userId;
    private Integer status;
}
