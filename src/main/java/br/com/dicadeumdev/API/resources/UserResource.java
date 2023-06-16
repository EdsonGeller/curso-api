package br.com.dicadeumdev.API.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dicadeumdev.API.domain.user;

@RestController
@RequestMapping(value = "/user")
public class UserResource {
    @GetMapping(value = "/{id}")
    public ResponseEntity<user> findById(@PathVariable Integer id){
        return ResponseEntity.ok().body(new user(1, "Valdir", "val@gmail.com", "123"));
    }
}
