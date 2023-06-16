package br.com.dicadeumdev.API.services;

import java.util.List;

import br.com.dicadeumdev.API.domain.User;

public interface UserServices {
    User findById(Integer id);
    List<User> findAll();
}
