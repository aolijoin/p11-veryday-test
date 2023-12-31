package com.usian.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RibbonConfigBean {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     *
     * @return 随机
     *
     *   @Bean
     *     public IRule iRule() {
     *         return new RandomRule();
     *     }
     */

    /**
     *
     * @return 轮询
     */
    @Bean
    public IRule iRule() {
        return new RoundRobinRule();
    }

}
