package com.test.service.impl;


import com.test.pojo.City;
import com.test.service.CityDubboService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;


@DubboService
public class CityDubboServiceImpl implements CityDubboService {
    @Override
    public City findCityByName(String cityName) {
        System.out.println("dubbo服务调用。。。");
        return new City(1L,2L,"温岭","是我的故乡");
    }
}
