package com.chl.cloud.microservicesimpleconsumermovie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class MovieController {
  @Autowired
  private RestTemplate restTemplate;

  @GetMapping("/movie/{id}")
  public User findById(@PathVariable Long id) {
    return this.restTemplate.getForObject("http://microservice-provider-user:7900/simple/" + id, User.class);
  }
}
