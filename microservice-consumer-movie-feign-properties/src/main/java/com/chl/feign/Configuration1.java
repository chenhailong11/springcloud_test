package com.chl.feign;

import feign.Contract;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version : 1.0
 * @description
 * @Date 17:15 2017/8/4
 * @auth : chenhl
 */
@Configuration
public class Configuration1 {
    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }

  /*  @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("user", "password");
    }*/
}
