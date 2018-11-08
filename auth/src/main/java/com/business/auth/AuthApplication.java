package com.business.auth;

import com.business.auth.user.User;
import com.business.auth.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }

    @Bean
    public CommandLineRunner initialUserData(UserRepository repository) {
        return (args) -> {
            User user = new User("sommai.k@gmail.com", "sommai.k", "1234", "ADMIN");
            repository.save(user);
        };
    }
}
