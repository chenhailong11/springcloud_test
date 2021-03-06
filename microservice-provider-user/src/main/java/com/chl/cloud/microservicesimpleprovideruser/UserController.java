package com.chl.cloud.microservicesimpleprovideruser;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private EurekaClient discoveryClient;

  @GetMapping("/simple/{id}")
  public User findById(@PathVariable Long id) {

    return this.userRepository.findOne(id);
  }
  @GetMapping("/eureka_instance")
  public String serviceUrl(){
    InstanceInfo stores = discoveryClient.getNextServerFromEureka("MICROSERVICE-PROVIDER-USER", false);
    return stores.getHomePageUrl();
  }

  @PostMapping("/user")
  public User postUser(@RequestBody User user){
    //User save = userRepository.save(user);
    return user;
  }





}
