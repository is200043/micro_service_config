package com.business;

import com.business.promotion.Promotion;
import com.business.promotion.PromotionRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class PromotionApplication {

    public static void main(String[] args) {
        SpringApplication.run(PromotionApplication.class, args);
    }

    @Bean
    public CommandLineRunner initialPromotionData(PromotionRespository repository) {
        return (args) -> {
            repository.save(new Promotion("FREE100", 100.00));
            repository.save(new Promotion("FREE200", 200.00));
            repository.save(new Promotion("FREE150", 150.00));
        };
    }
}
