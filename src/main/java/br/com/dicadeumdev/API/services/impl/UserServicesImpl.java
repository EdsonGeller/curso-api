package br.com.dicadeumdev.API.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dicadeumdev.API.domain.User;
import br.com.dicadeumdev.API.repositories.UserRepository;
import br.com.dicadeumdev.API.services.UserServices;
import br.com.dicadeumdev.API.services.exceptions.ObjNotFoundException;
@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    private UserRepository repository;


    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id); 
        return obj.orElseThrow(() -> new ObjNotFoundException("Objeto não encontrado!"));
    }
    
    public List<User> findAll(){
        return repository.findAll();
    }
}
