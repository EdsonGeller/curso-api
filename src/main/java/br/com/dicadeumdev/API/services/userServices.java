package br.com.dicadeumdev.API.services;

import java.util.List;

import br.com.dicadeumdev.API.domain.User;
import br.com.dicadeumdev.API.domain.DTO.UserDTO;

public interface UserServices {
    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);
    void delete(Integer id);
}
