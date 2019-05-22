package com.sdsoon.demo;

import com.alibaba.dubbo.config.annotation.Service;
import com.sdsoon.model.City;
import com.sdsoon.service.CityService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By Chr on 2019/5/22.
 */
@Component
@Service(version = "3.0.0", timeout = 10000, interfaceClass = CityService.class)
public class CityServiceImpl implements CityService {
    @Override
    public List<City> queryCity() {

        City city1 = new City(1, "纽约", "No.1");
        City city2 = new City(1, "洛杉矶", "No.1");
        City city3 = new City(1, ",迈阿密", "No.2");
        City city4 = new City(1, "芝加哥", "No.2");
        City city5 = new City(1, "华盛顿", "No.2");

        List<City> cities = new ArrayList<City>();
        cities.add(city1);
        cities.add(city2);
        cities.add(city3);
        cities.add(city4);
        cities.add(city5);

        return cities;
    }
}
