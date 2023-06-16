package br.com.dicadeumdev.API.services.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.dicadeumdev.API.domain.User;
import br.com.dicadeumdev.API.domain.DTO.UserDTO;
import br.com.dicadeumdev.API.repositories.UserRepository;
import br.com.dicadeumdev.API.services.exceptions.ObjNotFoundException;


@SpringBootTest
public class UserServicesImplTest {

    private static final Integer ID = 1;
    private static final String NAME = "Valdir";
    private static final String EMAIL = "valdir@gmail.com";
    private static final String PASSWORD = "123";

    @InjectMocks
    private UserServicesImpl service;
    @Mock
    private UserRepository repository;
    @Mock
    private ModelMapper mapper;

    private User user;
    private UserDTO userDTO;
    private Optional<User> optionalUser;

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
    void whenFindByIdThenReturnAnUserInstance() {
        when(repository.findById(anyInt())).thenReturn(optionalUser);

        User response = service.findById(ID);
        assertNotNull(response);
        assertEquals(User.class, response.getClass());
        assertEquals(ID, response.getId());
        assertEquals(NAME, response.getName());
        assertEquals(EMAIL, response.getEmail());

    }

    @Test
    void whenFindByIdThenReturnAnObjNotFoundException(){
        when(repository.findById(anyInt())).thenThrow(new ObjNotFoundException("Objeto não encontrado!"));

        try{
            service.findById(ID);
        } catch(Exception ex){
            assertEquals(ObjNotFoundException.class, ex.getClass());
            assertEquals("Objeto não encontrado!", ex.getMessage());
        }

    }

    @Test
    void testUpdate() {

    }

    private void startUser(){
        user = new User(ID, NAME, EMAIL, PASSWORD);
        userDTO = new UserDTO(ID, NAME, EMAIL, PASSWORD);
        optionalUser = Optional.of(new User(ID, NAME, EMAIL, PASSWORD));
    }
}
