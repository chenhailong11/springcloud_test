package com.chl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 * 随机平衡器
 */
@Configuration
public class TestConfiguration {
  //  @Autowired
  //  IClientConfig config;

  @Bean
  public IRule ribbonRule() {

    return new RandomRule();
  }
}
