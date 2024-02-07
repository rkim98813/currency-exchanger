package com.poscodx.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class WebConfig {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        //일정 시간이 지나도 응답이 없다면 연결을 강제로 끊어주도록
        builder.setConnectTimeout(Duration.ofSeconds(10));
        builder.setReadTimeout(Duration.ofSeconds(10));
        return builder.build();
    }
}
