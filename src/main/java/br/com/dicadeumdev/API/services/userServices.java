package br.com.dicadeumdev.API.services;

import br.com.dicadeumdev.API.domain.User;

public interface UserServices {
    User findById(Integer id);
}
