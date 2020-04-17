package com.mendes.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mendes.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
