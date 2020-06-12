package com.telecom.demo.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.telecom.demo.*")
// scan entity beans, this config could be moved to WebDbConfig class
@EntityScan("com.telecom.demo.entity")
// enable JPA and point to the location of repositories
@EnableJpaRepositories("com.telecom.demo.repository")
public class TelecomApplication {

    public static void main(String[] args) {
        SpringApplication.run(TelecomApplication.class, args);
    }

}
