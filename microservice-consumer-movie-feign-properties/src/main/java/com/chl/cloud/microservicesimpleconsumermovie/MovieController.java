package com.chl.cloud.microservicesimpleconsumermovie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
public class MovieController {

  @Autowired
  private UserFeignInterface userFeignInterface;

  @GetMapping("/movie/{id}")
  //@RequestMapping(method = RequestMethod.GET, value = "/movie/{id}")
  public User findById(@PathVariable Long id) {
    return this.userFeignInterface.findById(id);
  }

/*  @GetMapping("/test")
  public User testPost(User user){
    return this.userFeignInterface.postUser(user);
  }*/


}
