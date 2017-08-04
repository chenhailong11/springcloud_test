package com.chl.cloud.microservicesimpleconsumermovie;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @version : 1.0
 * @description
 * @Date 13:51 2017/8/4
 * @auth : chenhl
 */
@FeignClient("microservice-provider-user")
public interface UserFeignInterface {

    @RequestMapping(method = RequestMethod.GET, value = "/simple/{id}")
    public User findById(@PathVariable("id") Long id);
}
