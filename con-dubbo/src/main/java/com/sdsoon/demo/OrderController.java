package com.sdsoon.demo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sdsoon.model.City;
import com.sdsoon.model.Order;
import com.sdsoon.service.CityService;
import com.sdsoon.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * dubbo消费者controller
 * <p>
 * Created By Chr on 2019/5/21.
 */

@RequestMapping("/dubbo")
@RestController
public class OrderController {

    //timeout 可以不指定，但是version一定要指定 不然会找不到服务 直连需要加url="dubbo://localhost:20880"
    @Reference(version = "2.0.0")
    private OrderService orderService;
    @Reference(version = "3.0.0")
    private CityService cityService;

    @RequestMapping(value = "/order")
    public Object sayHello() {

        List<Order> orders = orderService.queryOrder();
        return orders;
    }

    @RequestMapping(value = "/city")
    public Object sayHei() {

        List<City> orders = cityService.queryCity();
        return orders;
    }
}
