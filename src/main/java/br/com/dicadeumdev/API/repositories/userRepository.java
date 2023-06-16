package br.com.dicadeumdev.API.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dicadeumdev.API.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    
}
