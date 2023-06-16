package br.com.dicadeumdev.API.resources;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.dicadeumdev.API.domain.User;
import br.com.dicadeumdev.API.domain.DTO.UserDTO;
import br.com.dicadeumdev.API.services.UserServices;


@SpringBootTest
public class UserResourceTest {

    private static final Integer ID = 1;
    private static final String NAME = "Valdir";
    private static final String EMAIL = "valdir@gmail.com";
    private static final String PASSWORD = "123";
    private static final int INDEX = 0;

    private User user;
    private UserDTO userDTO;

    @InjectMocks
    private UserResource resource;
    @Mock
    private UserServices services;
    @Mock
    private ModelMapper mapper;


    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
        startUser();
    }


    @Test
    void testCreate() {

    }

    @Test
    void testDelete() {

    }

    @Test
    void testFindAll() {

    }

    @Test
    void testFindById() {

    }

    @Test
    void testUpdate() {

    }

    private void startUser(){
        user = new User(ID, NAME, EMAIL, PASSWORD);
        userDTO = new UserDTO(ID, NAME, EMAIL, PASSWORD);
    }
}
