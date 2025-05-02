package com.example.SpringBootPostgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.SpringBootPostgres.entity.User;
//Repository will retrieve the data from the database
public interface UserRepository extends JpaRepository<User, Integer> {

}
