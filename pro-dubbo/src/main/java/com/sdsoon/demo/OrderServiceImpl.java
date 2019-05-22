package com.sdsoon.demo;

import com.alibaba.dubbo.config.annotation.Service;
import com.sdsoon.model.Order;
import com.sdsoon.service.OrderService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


/**
 * dubbo:服务service
 * <p>
 * Created By Chr on 2019/5/21.
 */
@Component
@Service(version = "2.0.0", timeout = 10000, interfaceClass = OrderService.class)
public class OrderServiceImpl implements OrderService {

    @Override
    public List<Order> queryOrder() {
        Order order = new Order();
        order.setOrderId(1);
        order.setAddr("烟台");
        order.setPrice(100.0);

        Order order2 = new Order();
        order2.setOrderId(2);
        order2.setAddr("上海");
        order2.setPrice(200.0);


        Order order3 = new Order();
        order3.setOrderId(1);
        order3.setAddr("北京");
        order3.setPrice(300.0);

        List<Order> orderList = new ArrayList<Order>();
        orderList.add(order);
        orderList.add(order2);
        orderList.add(order3);

        return orderList;

    }
}
