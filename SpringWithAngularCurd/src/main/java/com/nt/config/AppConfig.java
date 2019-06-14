package com.nt.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("com.nt")
@EntityScan(basePackages="com.nt.model")
@EnableJpaRepositories(basePackages="com.nt.repositary")
public class AppConfig {

}
