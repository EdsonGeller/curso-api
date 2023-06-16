package br.com.dicadeumdev.API.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dicadeumdev.API.domain.user;
import br.com.dicadeumdev.API.services.userServices;

@RestController
@RequestMapping(value = "/user")
public class UserResource {
    
    @Autowired
    private userServices service;


    @GetMapping(value = "/{id}")
    public ResponseEntity<user> findById(@PathVariable Integer id){
        return ResponseEntity.ok().body(service.findById(id));
    }
}
