package com.wsib.projectx.service.claims.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.wsib.projectx.service.claims")
public class FeignConfiguration {

}
