package org.lee.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced //当服务提供者是集群的时候，需要赋予 RestTemplate 负载均衡的能力，默认是轮询的方式
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
