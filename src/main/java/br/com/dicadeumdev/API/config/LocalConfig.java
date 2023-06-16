package br.com.dicadeumdev.API.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.dicadeumdev.API.domain.User;
import br.com.dicadeumdev.API.repositories.UserRepository;

@Configuration
@Profile("local")
public class LocalConfig {
    
    @Autowired
    private UserRepository repository;


    @Bean
    public void startDb(){
        User u1 = new User(null, "Valdir", "valdir@gmail.com", "123");
        User u2 = new User(null, "Luiz", "luiz@gmail.com", "123");

        repository.saveAll(java.util.List.of(u1, u2));
    }
}
