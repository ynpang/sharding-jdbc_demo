package com.enjoy.mapper;

import com.enjoy.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderMapper {

    @Options( useGeneratedKeys = true, keyColumn = "order_id", keyProperty = "orderId")
    @Insert(" insert into order(user_id,status) values(#{userId}, #{status} )")
    int insert(Order order);

    @Select("select order_id,user_id,status from order where userId = #{userId} and order_id = #{orderId}")
    List<Order> getAllOrder(@Param("userId") Integer userId,@Param("orderId") Long orderId);
}
