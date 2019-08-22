package com.enjoy;

import com.enjoy.entity.Order;
import com.enjoy.entity.OrderItem;
import com.enjoy.mapper.ConfigMapper;
import com.enjoy.mapper.OrderItemMapper;
import com.enjoy.mapper.OrderMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DataOpts {

    @Resource
    private OrderMapper orderMapper;

    @Resource
    private OrderItemMapper orderItemMapper;

    @Resource
    private ConfigMapper configMapper;


    public void addOrder(Integer userId){
        Order order = new Order();

        order.setUserId(userId);
        order.setStatus(userId%2);
        this.orderMapper.insert(order);

        OrderItem orderItem = new OrderItem();
        orderItem.setOrderId(order.getOrderId());
        orderItem.setUserId(userId);
        orderItem.setStatus(userId%2);
        this.orderItemMapper.insert(orderItem);
    }


    public List<Order> getAllOrder(Integer userId,Long orderId){
        return orderMapper.getAllOrder(userId,orderId);
    }

    public void addConfig(){
        configMapper.insert();

    }
}
