package br.com.dicadeumdev.API.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dicadeumdev.API.domain.user;
import br.com.dicadeumdev.API.repositories.userRepository;
import br.com.dicadeumdev.API.services.userServices;
@Service
public class userServiceImpl implements userServices {

    @Autowired
    private userRepository repository;


    @Override
    public user findById(Integer id) {
        Optional<user> obj = repository.findById(id); 
        return obj.orElse(null);
    }
    
}
