package com.enjoy.mapper;

import com.enjoy.entity.OrderItem;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

public interface OrderItemMapper {

    @Options( useGeneratedKeys = true, keyColumn = "order_item_id", keyProperty = "orderItemId")
    @Insert(" insert into order_item(order_id,user_id,status) values(#{orderId},#{userId}, #{status} )")
    int insert(OrderItem orderItem);
}
