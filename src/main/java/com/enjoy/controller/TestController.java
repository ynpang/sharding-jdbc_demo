package com.enjoy.controller;

import com.enjoy.DataOpts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private DataOpts dataOpts;

    @GetMapping("/order/addBuyUserId")
    public Object addOrderByUserId(Integer userId){
        dataOpts.addOrder(userId);
        return "ok";
    }

   @GetMapping("/order/all")
    public Object getAll(Integer userId,Long orderId){
        return dataOpts.getAllOrder(userId,orderId);
    }

    @GetMapping("/config/add")
    public Object addConfig(){
        dataOpts.addConfig();
        return "ok";
    }
}
