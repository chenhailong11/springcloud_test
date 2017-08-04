package com.chl.cloud.microservicesimpleconsumermovie;

import com.chl.feign.Configuration1;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

/**
 * @version : 1.0
 * @description
 * @Date 13:51 2017/8/4
 * @auth : chenhl
 */
@FeignClient(name = "microservice-provider-user",configuration = Configuration1.class)
public interface UserFeignInterface {

    //@RequestMapping(method = RequestMethod.GET, value = "/simple/{id}")
    @RequestLine("GET /simple/{id}")
    public User findById(@Param("id") Long id);


 /*   @RequestMapping(method = RequestMethod.GET, value = "/user")
    public User postUser(@RequestBody User user); 
*/
}
