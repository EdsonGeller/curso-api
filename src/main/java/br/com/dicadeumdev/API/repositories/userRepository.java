package br.com.dicadeumdev.API.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dicadeumdev.API.domain.user;

@Repository
public interface userRepository extends JpaRepository<user, Integer>{
    
}
