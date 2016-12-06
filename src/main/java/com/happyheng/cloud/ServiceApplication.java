package com.happyheng.cloud;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * Created by happyheng on 16/11/26.
 */
@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableJpaRepositories
public class ServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ServiceApplication.class).run(args);
    }
}